package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import static java.sql.Types.NULL;

/**
 * Created by jayant on 7/2/17.
 */


class miwokArrayAdapter extends ArrayAdapter<miwokWord> {

    private int mBGColorResourceID;
    private MediaPlayer mMusicPlayer;

    public miwokArrayAdapter(Context context, ArrayList<miwokWord> miwokWordSupply, int miwokBGColorResourceID) {
        super(context, 0, miwokWordSupply);
        mBGColorResourceID = miwokBGColorResourceID;
    }

    public void releaseMediaPlayer(){
        if(mMusicPlayer != null){
            mMusicPlayer.release();
            //Toast.makeText(getContext(), "Done", Toast.LENGTH_SHORT).show();
            mMusicPlayer = null;
        }

    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final miwokWord currWord = getItem(position);

        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.miwok_imgView);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        LinearLayout miwokTextContainer = (LinearLayout) listItemView.findViewById(R.id.miwokTextContainer);

        miwokTextContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();
                mMusicPlayer = MediaPlayer.create(view.getContext(), currWord.getMusicResourceID());
                mMusicPlayer.start();
                //for releasing the mediaPlayer resources
                mMusicPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });
            }
        });

        Log.i("Current word", currWord.toString());


        miwokTextView.setText(currWord.getMiwok());
        defaultTextView.setText(currWord.getDefaultTranslation());

        if(currWord.getImageResourceID() != NULL) {
            miwokImage.setImageResource(currWord.getImageResourceID());
            miwokImage.setVisibility(View.VISIBLE);
        }
        else{
            miwokImage.setVisibility(View.GONE);
        }

        //find color id
        int color = ContextCompat.getColor(getContext(), mBGColorResourceID);
        miwokTextContainer.setBackgroundColor(color);
        return listItemView;
    }
}
