package com.example.puspakbiswas.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String a = intent.getStringExtra("msg");
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(a);
    }
}
