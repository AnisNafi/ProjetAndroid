package com.example.anis.projetm1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Anis on 4/4/2018.
 */

public class Line {

    @SerializedName("id")
    private String id;

    @SerializedName("shortName")
    private String shortName;

    @SerializedName("longName")
    private String longName;

    @SerializedName("color")
    private String color;

    @SerializedName("textColor")
    private String textColor;

    @SerializedName("mode")
    private String mode;

    @SerializedName("type")
    private String type;

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getIdItem() {
        return id;
    }

    public String getColorItem() {
        return color;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getMode() {
        return mode;
    }

    public String getType() {
        return type;
    }
}
