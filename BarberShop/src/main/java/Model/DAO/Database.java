/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Scheduling;
import Model.Client;
import Model.Service;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Database {
    
    public static ArrayList<User> user;
    public static ArrayList<Client> client;
    public static ArrayList<Service> service;
    public static ArrayList<Scheduling> scheduling;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        user = new ArrayList<User>();
        client = new ArrayList<Client>();
        service = new ArrayList<Service>();
        scheduling = new ArrayList<Scheduling>();
        
        //criando elementos 
        User user1 = new User(1, "barbeiro", 'M', "09/05/1996", "30212121", "barbeiro@barbershop.com", "521454123", "barbeiro", "administrador");
        User user2 = new User(2, "estagiario", 'M', "09/05/1996", "30212122", "estagiario@barbershop.com", "451244123", "estagiario", "funcionario");
         
        Client client1 = new Client(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "email@gmail.com", "5142e87", "Rua jaboti 35 Canudos NH",  "93300e12");
        Client client2 = new Client(2, "Ana Oliveira", 'F', "30/08/1994", "30212127", "email@gmail.com", "5142e87745", "Rua campo bom 78 Centro NH",  "933000e5");
        Client client3 = new Client(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "email@gmail.com", "784e458", "Rua Tres Irmaos 30 Vila Nova - NH",  "93300e496");
        Client client4 = new Client(4, "Marcos Santos", 'M', "20/08/1995", "30212130", "email@gmail.com", "274e487", "Rua Lombardi 40 Canudos NH",  "933e0748");
        Client client5 = new Client(5, "Débora Silva", 'M', "13/09/1992", "30212131", "email@gmail.com", "4742e87", "Rua pedro quaresma 784 Canudos Belgica",  "93e00847");
        Client client6 = new Client(6, "John Doe", 'M', "17/08/1994", "302122324", "johndoe@gmail.com", "7851e57", "Rua champions 10 Kephas Franca",  "933e00782");
        Client client7 = new Client(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "email@gmail.com", "465e37314", "Rua tesla 215 Canudos NH",  "9335e12");
        Client client8 = new Client(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "email@gmail.com", "847e23687", "Rua hyrule 32 Canudos NH",  "93347147e7");
        Client client9 = new Client(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "email@gmail.com", "7459e42487", "Rua floresta 12 Canudos NH",  "9e0046364");
        Client client10 = new Client(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "email@gmail.com", "8457e647", "Rua marechal 1023 Canudos NH",  "93300e874");
        
        Service service1 = new Service(1, "Corte Simples", 18);
        Service service2 = new Service(2, "Corte Degradê", 30);
        Service service3 = new Service(3, "Barba Simples", 15);
        Service service4 = new Service(4, "Barba Desenhada", 25);
        Service service5 = new Service(5, "Sobrancelhas", 10);
        Service service6 = new Service(6, "Penteados", 3);

        Scheduling scheduling1 = new Scheduling(1, client1, service2, 30, "14/03/2023 09:30");
        Scheduling scheduling2 = new Scheduling(2, client3, service4, 40, "14/03/2023 10:00");
        Scheduling scheduling3 = new Scheduling(3, client4, service1, 18, "14/03/2023 10:30");
        
        //Adiciona Elementos na lista
        user.add(user1);
        user.add(user2);
        
        client.add(client1);
        client.add(client2);
        client.add(client3);
        client.add(client4);
        client.add(client5);
        client.add(client6);
        client.add(client7);
        client.add(client8);
        client.add(client9);
        client.add(client10);
        
        service.add(service1);
        service.add(service2);
        service.add(service3);
        service.add(service4);
        service.add(service5);
        service.add(service6);
        
        scheduling.add(scheduling1);
        scheduling.add(scheduling2);
        scheduling.add(scheduling3);
        
    }
}
