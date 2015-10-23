package com.example.johannes.fragthisiamout;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by johannes on 23/10/2015.
 */
public class FragmentAtas extends Fragment{

    private static EditText edit_text_top;
    private static EditText edit_text_buttom;
    private static Button button_save;

    listenerFragmentAtas activityComander;

    public interface listenerFragmentAtas{
        void createMeme(String top, String button);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityComander = (listenerFragmentAtas) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_atas, container, false);

        edit_text_top = (EditText) view.findViewById(R.id.edit_text_top);
        edit_text_buttom = (EditText) view.findViewById(R.id.edit_text_buttom);
        button_save = (Button) view.findViewById(R.id.button_save);

        button_save.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClick(v);
                    }
                }
        );

        return view;
    }

    //click when button cliked
    public void buttonClick(View v){
        activityComander.createMeme(edit_text_top.getText().toString(), edit_text_top.getText().toString());
    }
}
