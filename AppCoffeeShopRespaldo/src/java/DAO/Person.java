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
public class Person {
    
    private String idCliente;
    private String Name;
    private String LastName;

    public Person(String idCliente, String Name, String LastName) {
        this.idCliente = idCliente;
        this.Name = Name;
        this.LastName = LastName;
    }
    
    public Person(){
        
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return idCliente + " - "+ Name +" - "+ LastName;
    }
    
    
}
