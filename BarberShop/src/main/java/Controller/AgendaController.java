/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Client;
import Model.DAO.ClientDAO;
import Model.DAO.SchedulingDAO;
import Model.DAO.ServiceDAO;
import Model.Scheduling;
import Model.Service;
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
    
    public void updateClient() {
        //get clients from database
        ClientDAO clientDAO = new ClientDAO();
        ArrayList<Client> clients = clientDAO.selectAll();
        // shoow clients in combobox
        helper.fillClients(clients);
    }
    
     public void updateService() {
        //get services from database
        ServiceDAO serviceDAO = new ServiceDAO();
        ArrayList<Service> services = serviceDAO.selectAll();
        // shoow services in combobox
        helper.fillServices(services);
    }
     
    public void updatePrice() {
        Service service = helper.obtainService();
        helper.setPrice(service.getValue());
    }
}
