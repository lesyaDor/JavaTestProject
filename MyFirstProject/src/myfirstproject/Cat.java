/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

/**
 *
 * @author student
 */
public class Cat {

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private String name;
    private String color;
    
    public Cat() {
        name = "Kiki";
        color = "black";
    }
    
    public void run() {
        System.out.println("Cat can run");
    }
    
    public String eat(String a) {
        return "The cat eats " + a;
    }
    
    public void ToString() {
        System.out.println("The cat "+this.name+" is of color "+this.color);
    }
}
