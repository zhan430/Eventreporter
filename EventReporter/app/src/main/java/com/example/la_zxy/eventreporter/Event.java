package com.example.la_zxy.eventreporter;

/**
 * Created by LA-ZXY on 6/19/17.
 */

public class Event {
//    /**
//     * All data for a event.
//     */
    private String address;
//    private String description;
//
//    /**
//     * Constructor
//     */

//
//    /**
//     * Getters for private attributes of Event class.
//     */
    public String getAddress() {
        return this.address;
    }
//    public String getDescription() { return this.description; }
    private int good;
    private int bad;
    private int commentNumber;
    private String id;
    private String location;
    private long time;
    private String username;
    private String description;
    private int repost;
    private String title;

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String imgUri = "";
    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public Event() {}

    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

}
