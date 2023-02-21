/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.User;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class UserDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param user exige que seja passado um objeto do tipo usuario
     */
    public void insert(User user){
        Database.user.add(user);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
    public boolean update(User user){
        
        for (int i = 0; i < Database.user.size(); i++) {
            if(idSaoIguais(Database.user.get(i),user)){
                Database.user.set(i, user);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param user
     * @return 
     */
    public boolean delete(User user){
        for (User usuarioLista : Database.user) {
            if(idSaoIguais(usuarioLista,user)){
                Database.user.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<User> selectAll(){
        return Database.user;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param user
     * @return Usuario encontrado no banco de dados
     */
    public User selectPorNomeESenha(User user){
        for (User usuarioLista : Database.user) {
            if(nomeESenhaSaoIguais(usuarioLista,user)){
                return usuarioLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param user
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(User user, User usuarioAPesquisar) {
        return user.getName().equals(usuarioAPesquisar.getName()) && user.getPassword().equals(usuarioAPesquisar.getPassword());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(User user, User usuarioAComparar) {
        return user.getId() ==  usuarioAComparar.getId();
    }
    
    
    
}
