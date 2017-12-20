package com.example.mishr.newz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
        RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        radioGroup = (RadioGroup)findViewById(R.id.radio_color_group);
        Toast.makeText(this, "Color Setting as Background still in Processs..!!", Toast.LENGTH_SHORT).show();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radio_red:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF6347"));
                        Toast.makeText(SettingsActivity.this, "Red Colour Set..!!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_yellow:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        Toast.makeText(SettingsActivity.this, "Yellow Colour Set..!!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_blue:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
                        Toast.makeText(SettingsActivity.this, "Blue Colour Set..!!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_magenta:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        Toast.makeText(SettingsActivity.this, "Magenta Colour Set..!!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
        return true;
    }
}
