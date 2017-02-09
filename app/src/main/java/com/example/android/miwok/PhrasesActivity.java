package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("Where are you going?", "minto wuksus"));
        words.add(new miwokWord("What is your name?","tinnә oyaase'nә"));
        words.add(new miwokWord("My name is...","oyaaset..."));
        words.add(new miwokWord("How are you feeling?","michәksәs?"));
        words.add(new miwokWord("I’m feeling good.","kuchi achit"));
        words.add(new miwokWord("Are you coming?","әәnәs'aa?"));
        words.add(new miwokWord("Yes, I’m coming.","hәә’ әәnәm"));
        words.add(new miwokWord("I’m coming.","әәnәm"));
        words.add(new miwokWord("Let’s go.","yoowutis"));
        words.add(new miwokWord("Come here.","na' әnni'nem"));

        miwokArrayAdapter itemsAdapter = new miwokArrayAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
