package com.example.edi.bob_lab2;

import android.app.Fragment;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  ActionFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void OnFragmentInteraction(String link) {
        TextFragment fragment = (TextFragment) getFragmentManager().findFragmentById(R.id.txFragment);
        if (fragment != null && fragment.isInLayout()) {
            fragment.setText(link);
        }
    }
}
