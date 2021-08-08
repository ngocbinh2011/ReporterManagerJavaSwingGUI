/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplication;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Post implements  Serializable, IObject{
    private int id;
    private String nameClass;
    private int price;
    private static int currentId = 100;

    public Post() {
        this.id = currentId++;
    }   

    public Post(String nameClass, int price) {
        this();
        this.nameClass = nameClass;
        this.price = price;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Post.currentId = currentId;
    }
    
    @Override
    public Object[] toObject(){
        return new Object[]{Integer.toString(id), nameClass, Integer.toString(price)};
    }
    
    @Override
    public String toString(){
        return String.valueOf(id) + "-" + nameClass + "-" + Integer.toString(price);
    }
    
    
}
