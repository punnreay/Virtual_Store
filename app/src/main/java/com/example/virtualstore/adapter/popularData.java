package com.example.virtualstore.adapter;

public class popularData {
    private String title_pop;
    private int pic_pop;
    private String description;
    private Double price;

    public popularData(String title_pop, int pic_pop, String description, Double price) {
        this.title_pop = title_pop;
        this.pic_pop = pic_pop;
        this.description = description;
        this.price = price;
    }

    public String getTitle_pop() {
        return title_pop;
    }

    public void setTitle_pop(String title_pop) {
        this.title_pop = title_pop;
    }

    public int getPic_pop() {
        return pic_pop;
    }

    public void setPic_pop(int pic_pop) {
        this.pic_pop = pic_pop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
