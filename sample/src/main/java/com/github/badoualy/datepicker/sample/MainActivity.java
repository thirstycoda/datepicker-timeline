package com.github.badoualy.datepicker.sample;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.badoualy.datepicker.DatePickerTimeline;
import com.github.badoualy.datepicker.MonthView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        DatePickerTimeline timeline = findViewById(R.id.timeline);
        timeline.setDateIconAdapter(new MonthView.DateIconAdapter() {
            @Override
            public Drawable getIcon(Calendar calendar, int index) {
                return index % 4 == 0 ? ContextCompat.getDrawable(MainActivity.this, R.drawable.ic_star_black_24dp) : null;
            }
        });

        timeline.setOnDateSelectedListener(new DatePickerTimeline.OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day, int index) {

            }
        });

        timeline.setFirstVisibleDate(2016, Calendar.JULY, 19);
        timeline.setLastVisibleDate(2020, Calendar.JULY, 19);
        //timeline.setFollowScroll(false);
    }

}
