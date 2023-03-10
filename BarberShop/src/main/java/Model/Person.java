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
abstract public class Person {
    protected int id;
    protected String name;
    protected char gender;
    protected Date birthDate;
    protected String phone;
    protected String email;
    protected String idnumber;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, char gender, String birthDate, String phone, String email, String idnumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
         try 
        {
            this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        }
        catch (ParseException ex){
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.phone = phone;
        this.email = email;
        this.idnumber = idnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
    
    
    
    
    
}
