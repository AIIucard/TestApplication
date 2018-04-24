package com.example.mmw.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //public final String LOG_TAG = "LOGTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            ((Button) findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onButton1();
                }
            });
        }catch(Exception e) {
            e.printStackTrace();
        }

        try{
            ((Button) findViewById(R.id.button7)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onButton7();
                }
            });
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    private void onButton1() {
        Intent intent1 = new Intent(this, AddDiscussionParticipant.class);
        startActivity(intent1);
    }

    private void onButton7() {
        Intent intent7 = new Intent(this, ItentTestActivity.class);
        startActivity(intent7);
        //TODO function of button7
    }
}
