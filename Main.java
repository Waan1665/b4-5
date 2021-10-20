/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

public class Main {    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Audi");
        cars.add("BMW");
        for (String i : cars){
            System.out.println("i");            
        } 
    }    
}
