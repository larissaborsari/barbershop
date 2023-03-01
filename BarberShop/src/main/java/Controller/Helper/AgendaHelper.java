/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Client;
import Model.Scheduling;
import Model.Service;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Larissa Borsari
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void fillTable(ArrayList<Scheduling> schedulings) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //iterate list, filling table model
        for (Scheduling scheduling : schedulings) {
            tableModel.addRow(
                    new Object[]{
                    scheduling.getId(),
                    scheduling.getClient().getName(),
                    scheduling.getService().getDescription(),
                    scheduling.getValue(),
                    scheduling.getFormatedDate(),
                    scheduling.getFormatedTime(),
                    scheduling.getNotes()
                        
        });
        }
    }

    public void fillClients(ArrayList<Client> clients) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getTextCliente().getModel();
        
        for (Client client : clients) {
            comboBoxModel.addElement(client);
        }
    }

    public void fillServices(ArrayList<Service> services) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getTextServico().getModel();
        
        for (Service service : services) {
            comboBoxModel.addElement(service);
        }
    }

    public Client obtainClient() {
       return (Client) view.getTextCliente().getSelectedItem();
    }
    
    public Service obtainService() {
       return (Service) view.getTextServico().getSelectedItem();
    }

    public void setPrice(float value) {
       view.getTextValor().setText(value+"");
    }

    @Override
    public Scheduling obtainModel() {
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Client client = obtainClient();
        Service service = obtainService();
        String valueString = view.getTextValor().getText();
        float price = Float.parseFloat(valueString);
        String date = view.getTextFormatedData().getText();
        String time = view.getTextFormatedHora().getText();
        String dateTime = date+" "+time;
        String notes = view.getTextObservacao().getText();
        Scheduling scheduling = new Scheduling(id, client, service, price, dateTime, notes);
        return scheduling;
    }

    @Override
    public void clearScreen() {
        view.getTextId().setText("0");
        view.getTextFormatedData().setText("");
        view.getTextFormatedHora().setText("");
        view.getTextObservacao().setText("");
    }

}
