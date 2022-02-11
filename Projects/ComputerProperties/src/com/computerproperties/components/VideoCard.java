package com.computerproperties.components;

import com.computerproperties.commons.ComponentCommons;

public class VideoCard extends ComponentCommons {
    private final int vidId;
    private static int vidCount;
    private int gigabytes;

    public VideoCard(String brand, int gigabytes){
        super(brand);
        this.vidId = ++VideoCard.vidCount;
        this.gigabytes = gigabytes;
    }

    public int getVidId() {
        return vidId;
    }

    public int getGigabytes() {
        return gigabytes;
    }

    public void setGigabytes(int gigabytes) {
        this.gigabytes = gigabytes;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "vidId=" + vidId +
                ", gigabytes=" + gigabytes +
                ", " + super.toString() +
                '}';
    }
}
