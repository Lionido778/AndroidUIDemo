package com.example.androiduidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator_layout);

    }

    public void oneOnclick(View view) {
        if (view instanceof TextView) {
            String text = ((TextView) view).getText().toString();
            Log.d(TAG,"控件内容 : "+ text);
        }
    }

    public void oneOrangleOnclick(View view) {
        if (view instanceof TextView) {
            String text = ((TextView) view).getText().toString();
            Log.d(TAG,"控件内容 : "+ text);
        }
    }
}
