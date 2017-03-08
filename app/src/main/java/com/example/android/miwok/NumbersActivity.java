package com.example.android.miwok;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity {
    //miwokArrayAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder_layout);

        Fragment numFragment = new NumberFragment();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment_container, numFragment).commit();

    }

    @Override
    protected void onPause() {
        super.onPause();
        NumberFragment.releaseMedia();
    }

}