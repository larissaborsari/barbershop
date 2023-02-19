/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Client;
import Model.Service;
import Model.User;

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
        
        Client client1 = new Client("Rua Endereço", "8888888", 2, "Fulano");
        System.out.println(client1);
        
        User user1 = new User("password", "admin", 3, "admin3");
        System.out.println(user1);
                

        
    }
}
