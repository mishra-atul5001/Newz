package com.example.mishr.newz;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar loader;
    String url = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        loader = (ProgressBar) findViewById(R.id.loader);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                if (progress == 100) {
                    loader.setVisibility(View.GONE);
                    Toast.makeText(DetailsActivity.this, "Post is Ready..!!", Toast.LENGTH_SHORT).show();
                    Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE); // Added Vibration for post loading completion
                    vibrator.vibrate(150);
                } else {
                    loader.setVisibility(View.VISIBLE);
                    Toast.makeText(DetailsActivity.this, "Loading..Hold On..!!", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
