package com.example.mygridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private int[] flag={
            R.drawable.bangladesh_flag,
            R.drawable.pakistan_flag,
            R.drawable.india_flag,
            R.drawable.bhutan_flag,
            R.drawable.nepal_flag,
            R.drawable.thailand_flag,
            R.drawable.oman_flag,
            R.drawable.japan_flag,
            R.drawable.korea_flag,
            R.drawable.china_flag
    };

    String[] countryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames=getResources().getStringArray(R.array.country_names);
        gridView = (GridView)findViewById(R.id.gridViewId);

        CustomAdapter adapter = new CustomAdapter(this, flag, countryNames);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}