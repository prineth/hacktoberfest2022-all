package assistant.genuinecoder.s_assistant.main.components;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

import assistant.genuinecoder.s_assistant.R;
import assistant.genuinecoder.s_assistant.main.AppBase;
import assistant.genuinecoder.s_assistant.main.attendance.AttendanceActivity;

public class ListAdapter extends BaseAdapter {
    ArrayList<String> nameList;
    ArrayList<String> registers;
    Activity activity;

    ArrayList<Boolean> attendanceList;

    public ListAdapter(Activity activity, ArrayList<String> nameList, ArrayList<String> reg) {
        this.nameList = nameList;
        this.activity = activity;
        this.registers = reg;
        attendanceList = new ArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            attendanceList.add(new Boolean(true));
        }
    }

    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View v, ViewGroup parent) {
        if (v == null) {
            LayoutInflater vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.list_ele, null);
        }
        final int pos = position;
        TextView textView = (TextView) v.findViewById(R.id.attendanceName);
        textView.setText(nameList.get(position));
        final CheckBox checkBox = (CheckBox) v.findViewById(R.id.attMarker);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attendanceList.set(pos, checkBox.isChecked());
                Log.d("Attendance", nameList.get(position).toString() + " is absent " + attendanceList.get(position));
            }
        });
        return v;
    }

    public void saveAll() {
        for (int i = 0; i < nameList.size(); i++) {
            int sts = 1;
            if (attendanceList.get(i))
                sts = 1;
            else sts = 0;
            String qu = "INSERT INTO ATTENDANCE VALUES('" + AttendanceActivity.time + "'," +
                    "" + AttendanceActivity.period + "," +
                    "'" + registers.get(i) + "'," +
                    "" + sts + ");";
            AppBase.handler.execAction(qu);
            activity.finish();
        }
    }
}
