package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    miwokArrayAdapter itemsAdapter;

    protected void onStopMiwok(miwokArrayAdapter adapter){
        super.onStop();
        adapter.releaseMediaPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("One", "lutti", R.drawable.number_one,R.raw.number_one));
        words.add(new miwokWord("Two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new miwokWord("three","toolookosu", R.drawable.number_three,R.raw.number_three));
        words.add(new miwokWord("four","oyissa", R.drawable.number_four,R.raw.number_four));
        words.add(new miwokWord("five","massoka",R.drawable.number_five,R.raw.number_five));
        words.add(new miwokWord("six","temmoka",R.drawable.number_six,R.raw.number_six));
        words.add(new miwokWord("seven","kenekaku", R.drawable.number_seven,R.raw.number_seven));
        words.add(new miwokWord("eight","kawinta", R.drawable.number_eight,R.raw.number_eight));
        words.add(new miwokWord("nine","wo'e", R.drawable.number_nine,R.raw.number_nine));
        words.add(new miwokWord("ten","na' acaha", R.drawable.number_ten,R.raw.number_ten));

        itemsAdapter = new miwokArrayAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
    @Override
    protected void onPause(){
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }

}