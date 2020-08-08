package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.usingstring.R.string.Msg1;
import static com.example.usingstring.R.string.Msg2;

public class MainActivity extends AppCompatActivity {
    TextView textMsg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textMsg2=findViewById(R.id.TvMsg2);
        textMsg2.setText(Msg2);
        String tag;
        Log.i( "Lifecycle",  "Oncreate called...");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "Lifecycle",  "Onstart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i( "Lifecycle",  "OnResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "Lifecycle",  "OnPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Lifecycle",  "Onstop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "Lifecycle",  "Ondestroy called...");
    }
}