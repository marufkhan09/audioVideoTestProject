package com.example.audiovideosample;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize WebView properly
        webView = findViewById(R.id.webView); // Fix: You need to initialize the WebView with findViewById

        // Configure WebView settings for optimal performance
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if required by YouTube
        webView.getSettings().setDomStorageEnabled(true); // Enable DOM storage
        webView.setWebViewClient(new WebViewClient()); // Ensure links open within the WebView
        webView.loadUrl("https://youtube.com/"); // Load the URL
    }

}
