/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. private-default-protected-public
 */
package myfirstproject;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class MyFirstProject {
    final static String mystring = "This is the unchanged string";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Hi!");
        System.out.println(tryMethod(3));
        System.out.println(tryString());
        
        Animal a = new Animal();
        System.out.println(a.animalName+" "+a.animalAge);
        
        for (int i=0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("Введите новое имя:");
        String newname = scan.next();
        a.name(newname);
        System.out.println("Вы ввели: "+a.animalName);
        
        System.out.println("Let us try Person");
        Person p = new Person();
        p.setPersonId(23);
        p.setPersonName("newPerson");
        System.out.println(p.getPersonName()+" Id: "+p.getPersonId());
        System.out.println(Person.test);
        
        double[] myList = new double[5];
        myList[0]=6;
        
        Cat c = new Cat();
        c.ToString();
    }
    
    public static int tryMethod(int a){
        return a*2;
    }
    
    public static String tryString(){
        return mystring;
    }
    
}
