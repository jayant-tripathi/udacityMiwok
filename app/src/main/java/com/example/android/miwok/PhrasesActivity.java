package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class PhrasesActivity extends AppCompatActivity {

    //miwokArrayAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder_layout);


        Fragment phrasesFragment = new PhrasesFragment();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment_container, phrasesFragment).commit();

    }

    @Override
    protected void onPause(){
        super.onPause();
        PhrasesFragment.releaseMedia();
    }
}
