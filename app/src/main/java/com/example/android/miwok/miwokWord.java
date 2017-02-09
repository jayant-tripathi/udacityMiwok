package com.example.android.miwok;

import android.media.Image;

/**
 * Created by jayant on 7/2/17.
 */

class miwokWord {
    private  String mMiwok;
    private String mDefaultTranslation;
    private int mImageResourceID;


    public miwokWord(String englishWord, String miwok){
        mDefaultTranslation = englishWord;
        mMiwok = miwok;
    }

    public miwokWord(String englishWord, String miwok, int imageResourceID){
        mImageResourceID = imageResourceID;
        mDefaultTranslation = englishWord;
        mMiwok = miwok;
    }

    public String getMiwok(){
       return mMiwok;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceID(){return mImageResourceID;}

}