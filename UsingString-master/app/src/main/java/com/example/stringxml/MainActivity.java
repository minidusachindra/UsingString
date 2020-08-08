package com.example.stringxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Lifecycle", "OnCreate()invoked");
        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }

    public void onStart() {
        super.onStart();
        Log.i("Lifecycle", "onStart() invoked");

    }

    public void Restart() {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked");

    }

    public void Resume() {
        super.onResume();
        Log.i("Lifecycle", "OnResume() invoked");

    }

    public void onPause() {
        super.onPause();
        Log.i("Lifecycle", "OnPause()invoked");

    }

    public void onStop() {
        super.onStop();
        Log.i("Lifecycle", "OnStop() invoked");

    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "OnDestroy()invoked");

    }
}