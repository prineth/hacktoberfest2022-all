import sqlite3
import argparse
import sys


def get_connection(db_path):
    conn=sqlite3.connect(db_path)
    return conn


