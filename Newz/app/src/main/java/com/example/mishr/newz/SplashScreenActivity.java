package com.example.mishr.newz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "Hey There..!!", Toast.LENGTH_SHORT).show();

        for (int i=0;i<2500;i++){

        }
        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2500);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent go_to_main_screen = new Intent(SplashScreenActivity.this,MainActivity.class);
                    finish();
                    startActivity(go_to_main_screen);
                }
            }
        };
        timer.start();
    }
}
