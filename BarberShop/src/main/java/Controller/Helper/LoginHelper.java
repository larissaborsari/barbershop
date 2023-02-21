/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.User;
import View.Login;

/**
 *
 * @author Larissa Borsari
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public User getModel() {
        String name = view.getTextUsuario().getText();
        String password = view. getTextSenha().getText();
        
        User model = new User(password, 0, name);
        return model;
    };
    
    public void setModel(User model){
        String name = model.getName();
        String password = model.getPassword();
        
        view.getTextUsuario().setText(name);
        view.getTextSenha().setText(password);
    }
    
    public void clearScreen(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
}
