package com.company.valentin_danilov.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static Info info = new Info();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button first_c = findViewById(R.id.first_c);
        Button second_c = findViewById(R.id.scnd_c);
        Button third_c = findViewById(R.id.thrd_c);
        Button fourth_c = findViewById(R.id.frth_c);
        ButtonListener listener = new ButtonListener();
        first_c.setOnClickListener(listener);
        second_c.setOnClickListener(listener);
        third_c.setOnClickListener(listener);
        fourth_c.setOnClickListener(listener);
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id) {
                case R.id.first_c:
                    info.setCourseNum(1);
                    break;
                case R.id.scnd_c:
                    info.setCourseNum(2);
                    break;
                case R.id.thrd_c:
                    info.setCourseNum(3);
                    break;
                case R.id.frth_c:
                    info.setCourseNum(4);
            }
            Intent intent = new Intent(MainActivity.this, SpecialityActivity.class);
            startActivity(intent);
        }
    }
}
