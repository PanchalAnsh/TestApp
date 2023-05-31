package com.example.testapp;

public class InboxModel {
    int img;
    String shortmsg;
    String msg;

    public InboxModel(int img, String shortmsg, String msg) {
        this.img = img;
        this.shortmsg = shortmsg;
        this.msg = msg;
    }

    public int getImg() {
        return img;
    }

    public String getShortmsg() {
        return shortmsg;
    }

    public String getMsg() {
        return msg;
    }
}
