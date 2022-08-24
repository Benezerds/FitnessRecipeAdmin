package com.rezappstudio.fitnessrecipeadmin;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload() {
        //  Empty constructor
    }

    public Upload(String mName, String mImageUrl) {
        if (mName.trim().equals("")) {
            mName = "No Name";
        }
        this.mName = mName;
        this.mImageUrl = mImageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    @Override
    public String toString() {
        return "Upload{" +
                "mName='" + mName + '\'' +
                ", mImageUrl='" + mImageUrl + '\'' +
                '}';
    }
}
