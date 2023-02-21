/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
    
    public void doTask(){
        System.out.println("get something from database");
        this.view.showMessage("Run doTask");
    }
}
