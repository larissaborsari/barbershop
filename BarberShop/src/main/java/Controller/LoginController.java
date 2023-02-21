/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UserDAO;
import Model.User;
import View.Login;
import View.MenuPrincipal;

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
        UserDAO userDAO = new UserDAO();
        User authUser = userDAO.selectPorNomeESenha(user);
            //if found: redirect to menu
            if(authUser != null){
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                this.view.dispose();
            }else{
                view.showMessage("Invalid user or password");
            }
            //else: show error message
    }
}
