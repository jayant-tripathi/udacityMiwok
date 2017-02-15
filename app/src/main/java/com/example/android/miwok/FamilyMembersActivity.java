package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    miwokArrayAdapter itemsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("father", "әpә", R.drawable.family_father,R.raw.family_father));
        words.add(new miwokWord("mother","әṭa", R.drawable.family_mother,R.raw.family_mother));
        words.add(new miwokWord("son","angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new miwokWord("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new miwokWord("elder brother","tachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new miwokWord("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new miwokWord("elder sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new miwokWord("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new miwokWord("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new miwokWord("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        itemsAdapter = new miwokArrayAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }


    @Override
    protected void onPause(){
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }

}
