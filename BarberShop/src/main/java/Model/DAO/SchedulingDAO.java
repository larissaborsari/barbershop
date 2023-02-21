/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Scheduling;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class SchedulingDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param agendamento exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Scheduling scheduling){
          
        if(scheduling.getId() == 0){
            scheduling.setId(proximoId());
            Database.scheduling.add(scheduling);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamento
     * @return 
     */
    public boolean update(Scheduling scheduling){
        
        for (int i = 0; i < Database.scheduling.size(); i++) {
            if(idSaoIguais(Database.scheduling.get(i),scheduling)){
                Database.scheduling.set(i, scheduling);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamento
     * @return 
     */
    public boolean delete(Scheduling scheduling){
        for (Scheduling agendamentoLista : Database.scheduling) {
            if(idSaoIguais(agendamentoLista,scheduling)){
                Database.scheduling.remove(agendamentoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Scheduling> selectAll(){
        return Database.scheduling;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param scheduling
     * @param agendamentoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Scheduling scheduling, Scheduling agendamentoAComparar) {
        return scheduling.getId() ==  agendamentoAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Scheduling scheduling : Database.scheduling) {           
           int id = scheduling.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
