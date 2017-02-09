package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


import static android.R.attr.id;
import static android.R.attr.text;
import static java.sql.Types.NULL;

/**
 * Created by jayant on 7/2/17.
 */

class miwokArrayAdapter extends ArrayAdapter<miwokWord> {

    private int mBGColorResourceID;

    public miwokArrayAdapter(Context context, ArrayList<miwokWord> miwokWordSupply, int miwokBGColorResourceID) {
        super(context, 0, miwokWordSupply);
        mBGColorResourceID = miwokBGColorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        miwokWord currWord = getItem(position);

        Log.d("miwokWord position Le :","currWord" );

        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.miwok_imgView);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);


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
        View textContainer = listItemView.findViewById(R.id.miwokTextContainer);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
