/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Client;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ClientDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param client exige que seja passado um objeto do tipo cliente
     */
    public void insert(Client client){
        Database.client.add(client);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param cliente
     * @return 
     */
    public boolean update(Client client){
        
        for (int i = 0; i < Database.client.size(); i++) {
            if(idSaoIguais(Database.client.get(i),client)){
                Database.client.set(i, client);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param cliente
     * @return 
     */
    public boolean delete(Client client){
        for (Client clienteLista : Database.client) {
            if(idSaoIguais(clienteLista,client)){
                Database.client.remove(clienteLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Client> selectAll(){
        return Database.client;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param client
     * @param clienteAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Client client, Client clienteAComparar) {
        return client.getId() ==  clienteAComparar.getId();
    }
    
    
    
}
