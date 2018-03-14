package com.example.gun.loginfirebase;

/**
 * Created by Gun on 3/12/2018.
 */

public class ViewSingleItem {
    // Same name with database
    private String Image_URL, Image_Title;

    public ViewSingleItem(String url, String title) {
        Image_URL = url;
        Image_Title = title;
    }

    public ViewSingleItem() {

    }

    public String getImage_URL() {
        return Image_URL;
    }

    public String getImage_Title() {
        return Image_Title;
    }

    public void setImage_URL(String url) {
        Image_URL = url;
    }

    public void setImage_Title(String title) {
        Image_Title = title;
    }
}

