package com.example.android.miwok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jayant on 8/3/17.
 */

public class ColorsFragment extends Fragment {

    private static miwokArrayAdapter itemsAdapter;

    public static void releaseMedia() {
        itemsAdapter.releaseMediaPlayer();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new miwokWord("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new miwokWord("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new miwokWord("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new miwokWord("black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new miwokWord("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new miwokWord("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new miwokWord("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        itemsAdapter = new miwokArrayAdapter(getActivity(), words, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //return super.onCreateView(inflater, container, savedInstanceState);
        return rootView;
    }
}
