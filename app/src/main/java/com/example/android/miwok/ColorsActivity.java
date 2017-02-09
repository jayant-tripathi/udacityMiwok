package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new miwokWord("green","chokokki",R.drawable.color_green));
        words.add(new miwokWord("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new miwokWord("gray","ṭopoppi",R.drawable.color_gray));
        words.add(new miwokWord("black","kululli",R.drawable.color_black));
        words.add(new miwokWord("white","kelelli",R.drawable.color_white));
        words.add(new miwokWord("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new miwokWord("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        miwokArrayAdapter itemsAdapter = new miwokArrayAdapter(this, words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
