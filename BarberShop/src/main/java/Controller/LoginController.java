/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.User;
import View.Login;

/**
 *
 * @author Larissa Borsari
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;  
        this.helper = new LoginHelper(view);
    }
    
    public void logInSystem(){
        //get an user from view
        User user = helper.getModel();
        
        //find user in databse
            //if found: redirect to menu
            //else: show error message
    }
    
    public void doTask(){
        System.out.println("get something from database");
        this.view.showMessage("Run doTask");
    }
}
