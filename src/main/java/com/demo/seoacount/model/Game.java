package com.demo.seoacount.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "game")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "old_price")
    private String oldPrice;

    @Column(name = "new_price")
    private String newPrice;

    @Column(name = "game_describe")
    private String gameDescribe;

    @Column(name = "image")
    private String image;

    @Column(name = "trailer")
    private String trailer;

    @Column(name = "star")
    private int star;

    @Column(name = "promation")
    private int promation;

    @Column(name = "category_id")
    private int category_id;

    @Column(name = "menu_id")
    private int menu_id;

    public Game() {

    }

    public Game(String name, String code, String oldPrice, String newPrice, String gameDescribe, String image, String trailer, int star, int promation, int category_id, int menu_id) {
        this.name = name;
        this.code = code;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.gameDescribe = gameDescribe;
        this.image = image;
        this.trailer = trailer;
        this.star = star;
        this.promation = promation;
        this.category_id = category_id;
        this.menu_id = menu_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getGameDescribe() {
        return gameDescribe;
    }

    public void setGameDescribe(String gameDescribe) {
        this.gameDescribe = gameDescribe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getPromation() {
        return promation;
    }

    public void setPromation(int promation) {
        this.promation = promation;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", newPrice='" + newPrice + '\'' +
                ", gameDescribe='" + gameDescribe + '\'' +
                ", image='" + image + '\'' +
                ", trailer='" + trailer + '\'' +
                ", star=" + star +
                ", promation=" + promation +
                ", category_id=" + category_id +
                ", menu_id=" + menu_id +
                '}';
    }
}
