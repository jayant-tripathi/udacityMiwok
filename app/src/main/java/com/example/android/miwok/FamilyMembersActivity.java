package com.example.android.miwok;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;


public class FamilyMembersActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder_layout);

        Fragment familyFragment = new FamilyMemberFragment();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fragment_container, familyFragment).commit();

    }

    @Override
    protected void onPause(){
        super.onPause();
        FamilyMemberFragment.releaseMedia();
    }

}
