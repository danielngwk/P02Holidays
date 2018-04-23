package com.example.a16022653.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> type;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvType);

        type = new ArrayList<String>();
        type.add("Secular");
        type.add("Ethnic & Religion");


        aa = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, type);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedYear = type.get(position);

                Intent intent = new Intent(MainActivity.this,Main2.class);
                intent.putExtra("year", selectedYear);
                startActivity(intent);

            }
        });


    }
}
