package com.example.rbreportingtool.Application.Model;

public class DataMainMenuDto {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public DataMainMenuDto(String title, int imageId) {
        this.imageId = imageId;
        this.title = title;
    }
}
