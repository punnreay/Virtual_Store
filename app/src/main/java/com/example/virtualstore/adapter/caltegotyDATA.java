package com.example.virtualstore.adapter;

public class caltegotyDATA {
    private String item_name;
    private int item_pic;

    public caltegotyDATA(String item_name, int item_pic) {
        this.item_name = item_name;
        this.item_pic = item_pic;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_pic() {
        return item_pic;
    }

    public void setItem_pic(int item_pic) {
        this.item_pic = item_pic;
    }
}
