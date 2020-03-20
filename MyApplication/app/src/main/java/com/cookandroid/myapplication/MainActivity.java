package com.cookandroid.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button move, prev;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.WebArea);

        webView.setWebViewClient(new WebviewTestClass());

        WebSettings webSet = webView.getSettings();
        webSet.setBuiltInZoomControls(true);
        //여기에 url
        webView.loadUrl("https://google.com");
//        move.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                webView.loadUrl(url.getText().toString());
//            }
//        });
//        prev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                webView.goBack();
//            }
//        });
    }

    class WebviewTestClass extends WebViewClient {
        //webviewclient에서 상속 받았는데 필요한 메소드를 오버라이딩 해서 사용
        //클래스 내부에서 [code] - [override methods]선택

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);

        }
    }
}