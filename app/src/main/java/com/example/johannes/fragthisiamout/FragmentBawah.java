package com.example.johannes.fragthisiamout;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by johannes on 23/10/2015.
 */
public class FragmentBawah extends Fragment {

    private static TextView text_atas;
    private static TextView text_bawah;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bawah, container, false);

        text_atas = (TextView) view.findViewById(R.id.text_atas);
        text_bawah = (TextView) view.findViewById(R.id.text_bawah);

        return view;
    }

    public void cetakText(String top, String buttom){
        text_atas.setText(top);
        text_bawah.setText(buttom);
    }
}
