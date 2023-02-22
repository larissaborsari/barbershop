/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.SchedulingDAO;
import Model.Scheduling;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Larissa Borsari
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void updateTable() {
        //get list of scheduling from db
        SchedulingDAO schedulingDAO = new SchedulingDAO();
        ArrayList<Scheduling> schedulings = schedulingDAO.selectAll();
        
        //show list in view
        helper.fillTable(schedulings);
        
    }
}
