package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID = NO_AUDIO_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        this(defaultTranslation, miwokTranslation,audioResourceID);
        mImageResourceID = imageResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return (mImageResourceID != NO_IMAGE_PROVIDED);
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasAudio() {
        return (mAudioResourceID != NO_AUDIO_PROVIDED);
    }
}
