/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Larissa Borsari
 */
public class Scheduling {
    private int id;
    private Client client;
    private Service service;
    private float value;
    private Date date;
    private String notes;

    public Scheduling(int id, Client client, Service service, float value, String date) {
        this.id = id;
        this.client = client;
        this.service = service;
        this.value = value;
        try 
        {
            this.date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date);
        }
        catch (ParseException ex){
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Scheduling(int id, Client client, Service service, float value, String date, String notes) {
        this(id, client, service, value, date);
        this.notes = notes;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }
    public String getFormatedDate() {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
    
    public String getFormatedTime() {
        return new SimpleDateFormat("HH:mm").format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
}
