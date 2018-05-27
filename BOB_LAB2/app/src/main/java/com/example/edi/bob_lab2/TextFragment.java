package com.example.edi.bob_lab2;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class TextFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        return view;


    }
    public void setText(String item) {
        EditText textView = getView().findViewById(R.id.textView);

        if(item=="MONOSPACE"){
            textView.setTypeface(Typeface.MONOSPACE);

        }else if(item=="SERIF"){
            textView.setTypeface(Typeface.SERIF);


        }else if(item=="DEFAULT_BOLD"){
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }else if(item=="DEFAULT"){
            textView.setTypeface(Typeface.DEFAULT);
        }
    }
}
