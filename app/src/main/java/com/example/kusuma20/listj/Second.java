package com.example.kusuma20.listj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String tint = intent.getStringExtra("id");
        String tint1 = intent.getStringExtra("name");
        t1=(TextView) findViewById(R.id.textView2);
        t2=(TextView) findViewById(R.id.textView3);
t1.setText(tint);
        t2.setText(tint1);
    }

}
