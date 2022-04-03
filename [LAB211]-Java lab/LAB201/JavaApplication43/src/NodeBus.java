/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

    public class NodeBus {
   Bus info;
   NodeBus next;
   
   NodeBus(){
       
   }
   
   NodeBus(Bus x, NodeBus q) {
       info=x;
       next=q;
   }
   
   NodeBus(Bus x) {
       this(x,null);
   }
}
