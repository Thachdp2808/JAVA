/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Happy-2001
 */
public class Loggin {
    String User;
    String Pass;
    
    public Loggin(){
    
    } 

    public Loggin(String User, String Pass) {
        this.User = User;
        this.Pass = Pass;
    }
    public Loggin(String User) {
        this.User = User;
        
    }
    /*public Loggin(String Pass) {
    this.Pass = Pass;
    }*/

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}
