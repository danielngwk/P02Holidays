package com.example.a16022653.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2 extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Type> code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        lv = (ListView) this.findViewById(R.id.lv);
        tvYear = (TextView) findViewById(R.id.textView2);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);
        code = new ArrayList<Type>();
        aa = new TypeAdapter(this, R.layout.row, code);
        lv.setAdapter(aa);
        if (year.equals("Secular")) {
            code.add(new Type("New Year's Day", "1 Jan 2017", "nye"));
            code.add(new Type("Labour Day", "1 May 2017", "labor"));
        } else {
            code.add(new Type("Chinese New Year", "28-29 Jan 2017", "cny"));
            code.add(new Type("Good Friday", "14 April 2017", "friday"));
        }
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Type selectedDay = code.get(position);

                Toast.makeText(Main2.this, selectedDay.getName()
                                + " Date: " + selectedDay.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }


}
