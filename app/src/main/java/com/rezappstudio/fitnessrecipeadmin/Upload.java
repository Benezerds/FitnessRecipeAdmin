package com.rezappstudio.fitnessrecipeadmin;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mCalorie;

    public Upload() {
        //  Empty constructor
    }

    //  The name for each value in the database will be determined according to the naming of the parameter
    //  Setter and Getter is really important as well
    public Upload(String name, String imageUrl, String calorie) {
        if (name.trim().equals("")) {
            this.mName = "No Name";
        }
        this.mName = name;
        this.mImageUrl = imageUrl;
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

    public String getmCalorie() {
        return mCalorie;
    }

    public void setmCalorie(String mCalorie) {
        this.mCalorie = mCalorie;
    }

    @Override
    public String toString() {
        return "Upload{" +
                "name='" + mName + '\'' +
                ", imageUrl='" + mImageUrl + '\'' +
                ", calorie='" + mCalorie + '\'' +
                '}';
    }
}
