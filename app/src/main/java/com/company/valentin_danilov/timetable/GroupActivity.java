package com.company.valentin_danilov.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.groups_label);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ListView listView = findViewById(R.id.group_list);
        final String[] groups = getResources().getStringArray(MainActivity.info.getGroupId());
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, groups);
        listView.setAdapter(adapter);
    }
}
