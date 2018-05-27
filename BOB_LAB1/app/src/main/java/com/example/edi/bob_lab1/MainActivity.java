package com.example.edi.bob_lab1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText textView = findViewById(R.id.textView);
        RadioGroup radioGroup= findViewById(R.id.radioGroup);
        final RadioButton radioButton1=findViewById(R.id.radioButton);
        final RadioButton radioButton2=findViewById(R.id.radioButton2);
        final RadioButton radioButton3=findViewById(R.id.radioButton3);
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           if(radioButton1.isChecked()){
                                               textView.setTypeface(Typeface.MONOSPACE);
                                           }else if(radioButton2.isChecked()){
                                               textView.setTypeface(Typeface.SERIF);
                                           }
                                           if(radioButton3.isChecked()){
                                               textView.setTypeface(Typeface.DEFAULT_BOLD);
                                           }
                                       }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           textView.setTypeface(Typeface.DEFAULT);
                                       }
                                   }
        );
    }


}