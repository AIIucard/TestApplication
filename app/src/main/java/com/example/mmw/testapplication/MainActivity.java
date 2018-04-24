package com.example.mmw.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //public final String LOG_TAG = "LOGTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void OnClick(View view){
        Intent i = new Intent(this,AddDiscussionParticipant.class);
        startActivity(i);
    }



}
