package com.example.edi.bob_lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_file);

        Intent intent = getIntent();

        String message = intent.getStringExtra(settingsFragment.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);

        textView.setText(message);

    }
}
