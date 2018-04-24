package com.example.mmw.testapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItentTestActivity extends AppCompatActivity {

    public final static String LOG_TAG = "HelloWorldActivity";

    public void log(final String line) {
        Log.d(LOG_TAG, line);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((TextView) findViewById(R.id.textView)).append(line + '\n');
            }
        });
    }

    //          activity launched
    //                  |
    //                  V
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itent_test);
        ((TextView) findViewById(R.id.textView)).setMovementMethod(new ScrollingMovementMethod());
        log("onCreate");

        ((Button) findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton1();
            }
        });
        ((Button) findViewById(R.id.button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton2();
            }
        });
        ((Button) findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton3();
            }
        });
        ((Button) findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton4();
            }
        });
        ((Button) findViewById(R.id.button5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton5();
            }
        });
        ((Button) findViewById(R.id.button6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton6();
            }
        });
    }

    private void onButton1() {
        log("onButton1");

        String url = "http://www.htw-dresden.de";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private void onButton2() {
        log("onButton2");
        String url = "http://www.htw-dresden.de";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        intent.setClassName("org.mozilla.firefox", "org.mozilla.firefox.App");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private void onButton3() {
        log("onButton3");
    }

    private void onButton4() {
        log("onButton4");
    }

    private void onButton5() {
        log("onButton5");
    }

    private void onButton6() {
        log("onButton6");
    }

    //                  |
    //      life cycle  |
    //                  V
    @Override
    public void onStart() {
        super.onStart();
        log("onStart");
    }

    //                  |
    //      life cycle  |
    //                  V
    @Override
    public void onResume() {
        super.onResume();
        log("onResume");
        // TODO initialize resources
    }

    //                  |
    //         activity is running
    //                  V

    @Override
    public void onPause() {
        log("onPause");
        // TODO release resources
        super.onPause();
    }

    //                  |
    //      life cycle  |
    //                  V

    @Override
    public void onStop() {
        super.onStop();
    }

    //                  |
    //      life cycle  |
    //                  V

    @Override
    public void onDestroy() { // Note: do not count on this method being called!
        super.onDestroy();
    }
    //                  |
    //                  V
    //          activity shut down
}
