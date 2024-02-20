package com.example.albert_6_2_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV1;
    EditText eT1;
    String st ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV1 =  findViewById(R.id.wV1);
        eT1 = findViewById(R.id.eT1);
        wV1.setWebViewClient(new MyWebViewClient());
        wV1.getSettings().setJavaScriptEnabled(true);

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
    public void LOL(View view) {
        st = eT1.getText().toString();
        wV1.loadUrl(st);

    }
}