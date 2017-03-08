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

public class PhrasesFragment extends Fragment {

    private static miwokArrayAdapter itemsAdapter;

    public static void releaseMedia() {
        itemsAdapter.releaseMediaPlayer();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<miwokWord> words = new ArrayList<>();
        words.add(new miwokWord("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new miwokWord("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new miwokWord("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new miwokWord("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new miwokWord("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new miwokWord("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new miwokWord("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new miwokWord("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new miwokWord("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new miwokWord("Come here.", "na' әnni'nem", R.raw.phrase_come_here));

        itemsAdapter = new miwokArrayAdapter(getActivity(), words, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        //return super.onCreateView(inflater, container, savedInstanceState);
        return rootView;
    }
}
