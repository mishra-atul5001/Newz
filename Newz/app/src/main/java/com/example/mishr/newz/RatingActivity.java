package com.example.mishr.newz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button rate,back_to_feed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        ratingBar = findViewById(R.id.rating_the_app);
        rate = findViewById(R.id.rate_button);
        back_to_feed = findViewById(R.id.back_to_feeds);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(RatingActivity.this,"You Rated us : "+rating.toString(), Toast.LENGTH_SHORT).show();   // Rating Toast

            }
        });

        back_to_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
        // Modifying the default nature of Back Button..!!
    }
}
