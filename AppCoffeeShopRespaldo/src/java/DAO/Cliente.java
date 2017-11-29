/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author diego
 */
public class Cliente extends Person {
    
    
    private String Email;
    private String phoneNumbre;
    private String Address;

    public Cliente(String idCliente, String Name, String LastName, String Email, String phoneNumbre, String Address) {
        super(idCliente, Name, LastName);
        this.Email = Email;
        this.phoneNumbre = phoneNumbre;
        this.Address = Address;
    }
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumbre() {
        return phoneNumbre;
    }

    public void setPhoneNumbre(String phoneNumbre) {
        this.phoneNumbre = phoneNumbre;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    
   
    
}
