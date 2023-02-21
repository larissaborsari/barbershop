/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import View.Login;

/**
 *
 * @author Larissa Borsari
 */
public class LoginController {

    private final Login view;
    
    public LoginController(Login view){
        this.view = view;  
    }
    
    public void logInSystem(){
        //get an user from view
        String name = view.getTextUsuario().getText();
        String password = view. getTextSenha().getText();
        
        User model = new User(password, 0, name);
        
        //find user in databse
            //if found: redirect to menu
            //else: show error message
    }
    
    public void doTask(){
        System.out.println("get something from database");
        this.view.showMessage("Run doTask");
    }
}
