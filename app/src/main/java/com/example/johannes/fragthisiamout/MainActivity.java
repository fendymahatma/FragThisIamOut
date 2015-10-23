package com.example.johannes.fragthisiamout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentAtas.listenerFragmentAtas{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String button) {
        FragmentBawah fragmentBawah = (FragmentBawah) getSupportFragmentManager().findFragmentById(R.id.fragment_buttom);
        fragmentBawah.cetakText(top, button);
    }
}
