package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("One", "lutti", R.drawable.number_one));
        words.add(new miwokWord("Two","otiiko",R.drawable.number_two));
        words.add(new miwokWord("three","toolookosu", R.drawable.number_three));
        words.add(new miwokWord("four","oyissa", R.drawable.number_four));
        words.add(new miwokWord("five","massoka",R.drawable.number_five));
        words.add(new miwokWord("six","temmoka",R.drawable.number_six));
        words.add(new miwokWord("seven","kenekaku", R.drawable.number_seven));
        words.add(new miwokWord("eight","kawinta", R.drawable.number_eight));
        words.add(new miwokWord("nine","wo'e", R.drawable.number_nine));
        words.add(new miwokWord("ten","na' acaha", R.drawable.number_ten));

        miwokArrayAdapter itemsAdapter = new miwokArrayAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
