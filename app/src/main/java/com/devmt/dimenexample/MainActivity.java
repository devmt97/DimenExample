package com.devmt.dimenexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String str = "";
        for (int i = 948; i < 1000; i++) {
            str += " <dimen name=\"dp" + (i + 1) + "\">" + (i + 1) + "dp</dimen>";
        }
        Log.d("LOGCAT", str);
    }
}
