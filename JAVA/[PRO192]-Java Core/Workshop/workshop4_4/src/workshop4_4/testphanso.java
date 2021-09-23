/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4_4;

/**
 *
 * @author Dell
 */
public class testphanso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        phanso Phanso1 = new phanso(3,4);
        phanso Phanso2 = new phanso(1,2);
        
        Phanso1.congphanso(Phanso2);
        Phanso1.truphanso(Phanso2);
        Phanso1.tichphanso(Phanso2);
        Phanso1.chiaphanso(Phanso2);
    }
    
}
