package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    miwokArrayAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        words.add(new miwokWord("green","chokokki",R.drawable.color_green,R.raw.color_green));
        words.add(new miwokWord("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new miwokWord("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new miwokWord("black","kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new miwokWord("white","kelelli",R.drawable.color_white,R.raw.color_white));
        words.add(new miwokWord("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new miwokWord("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        itemsAdapter = new miwokArrayAdapter(this, words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }


    @Override
    protected void onPause(){
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }

}
