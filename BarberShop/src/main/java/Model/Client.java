/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Larissa Borsari
 */
public class Client extends Person{
    
    private String address;
    private String zipcode;
    
    public Client(int id, String name, char gender, String birthDate, String phone,String email, String idnumber, String address, String zipcode) {
        super(id, name, gender, birthDate, phone, email, idnumber);
        this.address = address;
        this.zipcode = zipcode;
    }

    public Client(String address, String zipcode, int id, String name) {
        super(id, name);
        this.address = address;
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
