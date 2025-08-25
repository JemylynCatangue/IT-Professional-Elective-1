package com.example.jemylyncatangue;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class JemylynCatangueActivity extends AppCompatActivity {

    private static final String TAG = "JemylynCatangue";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jemylyn_catangue);
        textView = findViewById(R.id.textView);
        textView.setText("onCreate\n");
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart\n");
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume\n");
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause\n");
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop\n");
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy\n");
        Log.d(TAG, "onDestroy");
    }
}
