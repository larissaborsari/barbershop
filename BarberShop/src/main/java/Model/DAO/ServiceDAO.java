/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Service;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ServiceDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param service exige que seja passado um objeto do tipo servico
     */
    public void insert(Service service){
        Database.service.add(service);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param service
     * @return 
     */
    public boolean update(Service service){
        
        for (int i = 0; i < Database.service.size(); i++) {
            if(idSaoIguais(Database.service.get(i),service)){
                Database.service.set(i, service);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param service
     * @return 
     */
    public boolean delete(Service service){
        for (Service servicoLista : Database.service) {
            if(idSaoIguais(servicoLista,service)){
                Database.service.remove(servicoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Service> selectAll(){
        return Database.service;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Service service, Service servicoAComparar) {
        return service.getId() ==  servicoAComparar.getId();
    }
}
