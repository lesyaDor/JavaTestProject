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
public class Animal {
    public String animalName;
    public int animalAge;
    
    public Animal()
    {
        animalName = "name";
        animalAge = 2;
    }
    
    public String name(String s)
    {
        return this.animalName = s;
    }
}
