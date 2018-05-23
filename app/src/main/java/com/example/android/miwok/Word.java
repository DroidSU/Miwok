/**
Word is a arraylist of words that needs to be translated.
 */
package com.example.android.miwok;

public class Word {
    /**default translation of the word*/
    private String mDefaultTranslation;
    /**miwok translation of the word.*/
    private String mMiwokTranslation;
    /**image resource variable*/
    private int mImageResourceID = -1;
    /**constant to check availability of image*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**Creates a new word object
     *
     * @param defaultTranslation is the word in the default language
     * @param miwokTranslation is the miwok translation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Overloaded constructor to display list-items without image
     * @param imageResourceID is the id of the image resource that will be shown
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }
    /**
     * get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get the image resource id
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage()
    {
        return mImageResourceID!=NO_IMAGE_PROVIDED;
    }
}
