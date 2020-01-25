package com.demo.seoacount.model;

public class Game {
    private int id;
    private String name;
    private int promation;
    private String oldPrice;
    private String newPrice;
    private String image;
    private int star;

    public Game(int id, String name, int promation, String oldPrice, String newPrice, String image, int star) {
        this.id = id;
        this.name = name;
        this.promation = promation;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.image = image;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromation() {
        return promation;
    }

    public void setPromation(int promation) {
        this.promation = promation;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
