package com.example.edi.bob_lab3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class txtFragment extends Fragment {
    private TextView textView;

    final static String textViewKey = "OUTPUT_TEXTVIEW_TEXT";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.txt_fragment, container, false);

        textView = view.findViewById(R.id.output);

        if (savedInstanceState != null) {

            String savedText = savedInstanceState.getString(textViewKey);
            textView.setText(savedText);
        }

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putString(textViewKey, textView.getText().toString());

        super.onSaveInstanceState(outState);
    }

    public void setMessage(String message, Typeface typeface) {

        textView.setTypeface(typeface);

        textView.setText(message);

    }

}
