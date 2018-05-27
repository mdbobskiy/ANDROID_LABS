package com.example.edi.bob_lab2;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.plus.PlusOneButton;

public class ActionFragment extends Fragment {


    OnFragmentInteractionListener mListener;


    interface OnFragmentInteractionListener
    {
        void OnFragmentInteraction(String link);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action, container, false);


        try {
            mListener = (OnFragmentInteractionListener) view.getContext();
        } catch (ClassCastException e) {
            throw new ClassCastException(view.getContext().toString()
                    + " должен реализовывать интерфейс OnFragmentInteractionListener");
        }

        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        final RadioButton radioButton1=view.findViewById(R.id.radioButton);
        final RadioButton radioButton2=view.findViewById(R.id.radioButton2);
        final RadioButton radioButton3=view.findViewById(R.id.radioButton3);
        Button button1 = view.findViewById(R.id.button);
        Button button2 = view.findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           if(radioButton1.isChecked()){
                                               mListener.OnFragmentInteraction("MONOSPACE");
                                           }else if(radioButton2.isChecked()){
                                               mListener.OnFragmentInteraction("SERIF");
                                           }
                                           if(radioButton3.isChecked()){
                                               mListener.OnFragmentInteraction("DEFAULT_BOLD");
                                           }
                                       }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           mListener.OnFragmentInteraction("DEFAULT");
                                       }
                                   }
        );

        return view;
    }
}
