package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    miwokArrayAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new miwokWord("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new miwokWord("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new miwokWord("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new miwokWord("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new miwokWord("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new miwokWord("Yes, I’m coming.","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new miwokWord("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        words.add(new miwokWord("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        words.add(new miwokWord("Come here.","na' әnni'nem",R.raw.phrase_come_here));

        itemsAdapter = new miwokArrayAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }

    @Override
    protected void onPause(){
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }
}
