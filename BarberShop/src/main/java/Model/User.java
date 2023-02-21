/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Larissa Borsari
 */
public class User extends Person{
    
    private String password;    
    private String accessLevel;
    
    public User(int id, String name, char gender, String birthDate, String phone,String email, String idnumber, String password, String accessLevel) {
        super(id, name, gender, birthDate, phone, email, idnumber);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public User(String password, int id, String name) {
        super(id, name);
        this.password = password;
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
