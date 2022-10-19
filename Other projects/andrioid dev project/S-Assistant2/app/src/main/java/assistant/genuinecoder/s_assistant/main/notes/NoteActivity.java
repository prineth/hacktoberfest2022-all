package assistant.genuinecoder.s_assistant.main.notes;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import assistant.genuinecoder.s_assistant.R;
import assistant.genuinecoder.s_assistant.main.AppBase;

public class NoteActivity extends AppCompatActivity implements ListView.OnItemClickListener, ListView.OnItemLongClickListener {

    ListView listView;
    ArrayAdapter adapter;
    ArrayList titles;
    ArrayList contents;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        titles = new ArrayList();
        contents = new ArrayList();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_Note);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = new Intent(activity, NoteCreate.class);
                startActivity(launchIntent);
            }
        });

        listView = (ListView) findViewById(R.id.noteList);
        loadNotes();
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    private void loadNotes() {
        titles.clear();
        contents.clear();
        String qu = "SELECT * FROM NOTES";
        Cursor cursor = AppBase.handler.execQuery(qu);
        if (cursor == null || cursor.getCount() == 0) {
            Toast.makeText(getBaseContext(), "No Notes Found", Toast.LENGTH_LONG).show();
        } else {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                titles.add(cursor.getString(0));
                contents.add(cursor.getString(1));
                cursor.moveToNext();
            }
            adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, titles);
            listView.setAdapter(adapter);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.note_menu, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        alert.setTitle(titles.get(position).toString());
        alert.setMessage(contents.get(position).toString());
        alert.setPositiveButton("OK", null);
        alert.show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity);
        final String title = titles.get(position).toString();
        final String body = contents.get(position).toString();
        alert.setTitle("Delete ?");
        alert.setMessage("Do you want to delete this note ?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String qu = "DELETE FROM NOTES WHERE TITLE = '" + title + "' AND body = '" + body + "'";
                if (AppBase.handler.execAction(qu)) {
                    loadNotes();
                    Toast.makeText(getBaseContext(), "Deleted", Toast.LENGTH_LONG).show();
                } else {
                    loadNotes();
                    Toast.makeText(getBaseContext(), "Failed", Toast.LENGTH_LONG).show();
                }
                dialog.dismiss();
            }
        });
        alert.setNegativeButton("No", null);
        alert.show();
        return true;
    }


    public void refreshNote(MenuItem item) {
        loadNotes();
    }
}

