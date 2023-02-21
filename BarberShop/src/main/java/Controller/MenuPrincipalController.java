/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Larissa Borsari
 */
public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navigateToSchedule() {
        Agenda schedule = new Agenda();
        schedule.setVisible(true);
    }
}
