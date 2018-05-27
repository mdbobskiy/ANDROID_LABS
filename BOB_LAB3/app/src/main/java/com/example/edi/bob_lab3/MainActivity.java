package com.example.edi.bob_lab3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.edi.bob_lab3.settingsFragment;

public class MainActivity extends AppCompatActivity implements settingsFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String message, Typeface typeface) {

        txtFragment fragment = (txtFragment) getSupportFragmentManager().findFragmentById(R.id.txtFragment);

        if (fragment != null && fragment.isInLayout()) {
            fragment.setMessage(message, typeface);
        }
    }
}