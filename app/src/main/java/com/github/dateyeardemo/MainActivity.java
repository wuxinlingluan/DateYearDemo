package com.github.dateyeardemo;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Calendar calendar=Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt(View view) {
        //样式一定要选择 这个  不然是新样式  会崩溃
       new MonPickerDialog(this, AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
           @Override
           public void onDateSet(DatePicker datePicker, int year, int i1, int i2) {
               calendar.set(Calendar.YEAR, year);
               Toast.makeText(MainActivity.this, "年份为"+DateUtil.clanderTodatetime(calendar, "yyyy"), Toast.LENGTH_SHORT).show();
           }
       },calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)).show();
    }
}
