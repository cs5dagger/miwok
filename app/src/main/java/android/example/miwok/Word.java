package android.example.miwok;

//english translation and miwok translation

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslationk;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslationk = miwokTranslation;
        mAudioResourceId = audioResource;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslationk = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslationk;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
