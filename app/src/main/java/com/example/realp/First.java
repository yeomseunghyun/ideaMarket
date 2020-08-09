package com.example.realp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class First extends AppCompatActivity {
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                t.sleep(3000);
                Intent i = new Intent(First.this,MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        t.start();

    }
}
