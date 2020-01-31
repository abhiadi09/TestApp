package com.abhistudio.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    private AutoResizeEditText mAutoResizeEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAutoResizeEditText = (AutoResizeEditText) findViewById(R.id.editText);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

}
