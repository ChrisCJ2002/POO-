/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

/**
 *
 * @author LENOVO
 */
public class Usuario {
    private String usarname;
    private String passwordHash;

    public Usuario(String usarname, String passwordHash) {
        this.usarname = usarname;
        this.passwordHash = passwordHash;
    }

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    
    public boolean autenticar(String usarname, String passwordHash){
        return false;
    }
   

}
