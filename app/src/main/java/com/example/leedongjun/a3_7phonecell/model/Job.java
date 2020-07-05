package com.example.leedongjun.a3_7phonecell.model;

/**
 * Created by Lee Dong Jun on 2017-03-16.
 */
public class Job {
    private String title;
    private String description;
    private int image;

    public  Job(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}
