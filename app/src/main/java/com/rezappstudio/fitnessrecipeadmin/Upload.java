package com.rezappstudio.fitnessrecipeadmin;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mCalorie;

    public Upload() {
        //  Empty constructor
    }

    public Upload(String mName, String mImageUrl, String calorie) {
        if (mName.trim().equals("")) {
            mName = "No Name";
        }
        this.mName = mName;
        this.mImageUrl = mImageUrl;
        this.mCalorie = calorie;
    }

    public String getCalorie() {
        return mCalorie;
    }

    public void setCalorie(String calorie) {
        this.mCalorie = calorie;
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
                ", mCalorie='" + mCalorie + '\'' +
                '}';
    }
}
