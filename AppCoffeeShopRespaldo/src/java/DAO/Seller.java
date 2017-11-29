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
public class Seller extends Person {
    
    
    private String phoneNumbre;

    public Seller(String idCliente, String Name, String LastName, String phoneNumbre) {
        super(idCliente, Name, LastName);
        this.phoneNumbre = phoneNumbre;
    }

    public Seller(String idCliente, String Name, String LastName) {
        super(idCliente, Name, LastName);
    }

    public String getPhoneNumbre() {
        return phoneNumbre;
    }

    public void setPhoneNumbre(String phoneNumbre) {
        this.phoneNumbre = phoneNumbre;
    }

    
    
}
