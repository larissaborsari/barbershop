/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Service;

/**
 *
 * @author Larissa Borsari
 */
public class Main {
    public static void main(String[] args){
        String name = "Udo";
        System.out.println(name);
        
        Service service2 = new Service(2,"barba completa", 30);
        
        System.out.println(service2.getDescription());        
        System.out.println(service2.getValue());

    }
}
