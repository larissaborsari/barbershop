/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Larissa Borsari
 */
public class User extends Person{
    
    private String password;    
    private String accessLevel;

    public User(String password, String accessLevel, int id, String name, char gender, Date birthDate, String phone, String email, String idnumber) {
        super(id, name, gender, birthDate, phone, email, idnumber);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public User(String password, String accessLevel, int id, String name) {
        super(id, name);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
