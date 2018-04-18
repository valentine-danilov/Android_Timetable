package com.company.valentin_danilov.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SpecialityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.spec_label);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final ListView listView = findViewById(R.id.spec_list);
        final String[] groups = getResources().getStringArray(R.array.specialities);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, groups);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String) listView.getItemAtPosition(i);
                switch (item) {
                    case Info.itech:
                        MainActivity.info.setGroupId(R.array.itech_groups);
                        break;
                    case Info.am:
                        MainActivity.info.setGroupId(R.array.appm_groups);
                        break;
                    case Info.cs:
                        MainActivity.info.setGroupId(R.array.cs_groups);
                        break;
                    case Info.ec:
                        MainActivity.info.setGroupId(R.array.ec_groups);
                        break;
                    case Info.actm:
                        MainActivity.info.setGroupId(R.array.actm_groups);
                        break;
                    case Info.ait:
                        MainActivity.info.setGroupId(R.array.ait_groups);
                        break;
                }
                Intent intent = new Intent(SpecialityActivity.this, GroupActivity.class);
                startActivity(intent);
            }
        });

    }


}
