package com.vaidoos.guitorio.fragmentlibrary;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vaidoos.guitorio.customfraglib.NewDesign;

public class MainActivity extends AppCompatActivity implements NewDesign.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        NewDesign myFrag = (NewDesign) fragmentManager.findFragmentById(R.id.fragment);
        myFrag.Change_Text("Hello");

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
