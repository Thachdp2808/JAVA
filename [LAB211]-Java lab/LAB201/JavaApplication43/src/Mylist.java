
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Mylist {
    
   Validate Assigment = new Validate(); 
    
   public NodeCustomer cHead, cTail;
   public NodeBus busHead, busTail;
   
   
   public Mylist() {
        cHead = cTail = null;
        busHead = busTail = null;
        
    }

    public boolean isBusEmpty() {
        return busHead == null;
    }

    private NodeBus pos(int k) {
        NodeBus buss = busHead;
        while (true) {
            k--;
            if (k == 0) {
                return buss;
            }
            buss = buss.next;
        }
    }
    
    public void update(){
        for (NodeBus pj = busHead; pj.next != null; pj = pj.next) {
            if(pj.info.getBcode().equalsIgnoreCase("2")){
                pj.info.setSeat(9);
            }
        }
    }
    
    public void loadBus(String fname) {
        busHead = busTail = null;
        try {
            File file = new File(fname);
            if (!file.exists()) {
                System.out.println("File does not exist!");
                Assigment.showMes("\n");
                Assigment.inputText("Press \"Enter\" to back to menu!");
                return;
            }

            String data;
            String[] detail;
            try (Scanner myReader = new Scanner(file)) {
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    detail = data.split("\\|");
                    NodeBus newB = new NodeBus(new Bus(detail[0].trim(), detail[1].trim(),Integer.parseInt(detail[2].trim()),
                            Integer.parseInt(detail[3].trim()), 
                            Double.parseDouble(detail[4].trim()), Double.parseDouble(detail[5].trim())));
                    if (isBusEmpty()) {
                        busHead = busTail = newB;
                    }
                    busTail.next = newB;
                    busTail = newB;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
    
    public void saveBus(String fname) {
        try {
            File file = new File(fname);
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter myWriter = new FileWriter(fname)) {
                NodeBus Bus = busHead;
                while (Bus != null) {
                    String BusSave;
                    if (Bus == busHead) {
                        BusSave = String.format("%-5s|  %-12s|    %2d|   %d|  %.2f|  %.2f|  %.2f  \n", Bus.info.getBcode(),
                                Bus.info.getBus_name(), Bus.info.getSeat(), Bus.info.getBooked(), Bus.info.getDepart_time(),
                                Bus.info.getArrival_time(),Bus.info.getArrival_time()-Bus.info.getDepart_time());
                    } else {
                        BusSave = String.format("%-5s|  %-12s|    %2d|   %d|  %.2f|  %.2f|  %.2f  \n", Bus.info.getBcode(),
                                Bus.info.getBus_name(), Bus.info.getSeat(), Bus.info.getBooked(), Bus.info.getDepart_time(),
                                Bus.info.getArrival_time(),Bus.info.getArrival_time()-Bus.info.getDepart_time());
                    }

                    myWriter.write(BusSave);
                    Bus = Bus.next;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred when writing file.");
        }
        Assigment.showMes("\n----------SAVE DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
    public void visitBus(NodeBus p) {
        if (p != null) {
            Assigment.display(p.info);
            System.out.println();
        }
    }
    
    public void showBus() {
        NodeBus bus = busHead;
        while (bus != null) {
            visitBus(bus);
            bus = bus.next;
        }
        Assigment.showMes("\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
    public void addBus() {
        NodeBus newB = new NodeBus(new Bus("9","E",3,1,1,8));
        if (isBusEmpty()) {
            busHead = busTail = newB;
            Assigment.showMes("\n----------ADD DONE!----------\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
            return;
        }
        busTail.next = newB;
        busTail = newB;
        Assigment.showMes("\n----------ADD DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
    public NodeBus searchBus(String bcode) {
        NodeBus bus = busHead;
        while (bus != null) {
            if (bus.info.getBcode().equalsIgnoreCase(bcode)) {
                return bus;
            }
            bus = bus.next;
        }
        return null;
    }
    
    void removeFirst(){
       if(isBusEmpty()) return;
        busHead=busHead.next;
       if(busHead==null) busTail=null;
       
   }
    
     public void deleteBusBybcode(String bcode) {
         NodeBus bus = busHead;
         if(searchBus(bcode)==null) return;
         if(searchBus(bcode)==busHead){
             removeFirst();
             return;
         }
        if (searchBus(bcode) != null) {
            while (bus != null) {
                if (bus.next == searchBus(bcode)) {
                    bus.next = searchBus(bcode).next;
                    return;
                }
                bus = bus.next;
            }
        } else {
            Assigment.showWar("\nCode not exist!");
            Assigment.showMes("\n");
        }
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
     int CMP(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if ((int) (s1.charAt(i)) > (int) (s2.charAt(i))) {
                return 1;
            }
            if ((int) (s1.charAt(i)) < (int) (s2.charAt(i))) {
                return 0;
            }
            i++;
        }
        return 0;
    }
     
     public void sortBusBybcode() {
        for (NodeBus pi = busHead; pi != null; pi = pi.next) {
            for (NodeBus pj = busHead; pj.next != null; pj = pj.next) {
                if (CMP(pj.info.getBcode()+"", pj.next.info.getBcode()+"") == 1) {
                    Bus temp = pj.info;
                    pj.info = pj.next.info;
                    pj.next.info = temp;

                }
            }
        }
        Assigment.showMes("\n----------SORT DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
     public void sortByseat()
     {
         NodeBus pi,pj;
         Bus x;
         for ( pi = busHead; pi!=null; pi=pi.next) {
             for ( pj = pi.next; pj!=null; pj=pj.next) {
                 if(pj.info.getSeat()<pi.info.getSeat()){
                     x=pi.info;
                     pi.info=pj.info;
                     pj.info=x;
                 }
                 
             }
             
         }
     }
     
    public boolean checkbcode(String bcode){
            
            for (NodeBus pi = busHead; pi != null; pi = pi.next) {
                if(pi.info.getBcode().compareToIgnoreCase(bcode)==0){
                    System.out.println("bcode had exist");
                    return true;
                }
            }
            return false;
    }
    public void updatebcode(String bcode){
            
            for (NodeBus pi = busHead; pi != null; pi = pi.next) {
                if(pi.info.getBcode().compareToIgnoreCase(bcode)==0){
                    pi.info.setSeat(9);
                }
            }
    }
    
    public void addBusPos(int pos) {
       boolean t = true;
       String bcode;
        do{
            bcode=Assigment.inputText("\nEnter Bus bcode: ");
            t=checkbcode(bcode);
            if(t==false){
                break;
            }
        }while(t==true);
        String a=Assigment.inputbus_name();
        int k=Assigment.inputseat();
        int m=Assigment.inputbooked();
        double b=Assigment.validateDouble("\nEnter depart_time: ", 0, Double.MAX_EXPONENT);
        double d =Assigment.validateDouble("\nEnter arrival_time : ", (int)b , Double.MAX_EXPONENT);
        NodeBus newB = new NodeBus(new Bus(bcode,a,k,m,b,d));
        newB.next = pos(pos).next;
        pos(pos).next = newB;
        Assigment.showMes("\n----------ADD DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    } 
     
    public int sizeBus() {
        int s = 0;
        NodeBus p = busHead;
        while (p != null) {
            p = p.next;
            s++;
        }
        return s;
    }
    
    public void deleteAfterCode(String pcode) {
        if (searchBus(pcode) == null) {
            Assigment.showWar("\nCode not exist!");
            Assigment.showMes("\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
            return;
        }
        searchBus(pcode).next = searchBus(pcode).next.next;
        Assigment.showMes("\n----------DELETE DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
    //Customer
    
    public boolean isCustomerEmpty() {
        return cHead == null;
    }
    
    public void loadCustomer(String fname) {
        try {
            File file = new File(fname);
            if (!file.exists()) {
                System.out.println("File does not exist!");
                Assigment.showMes("\n");
                Assigment.inputText("Press \"Enter\" to back to menu!");
                return;
            }

            String data;
            String[] detail;
            try (Scanner myReader = new Scanner(file)) {
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    detail = data.split("\\|");
                    NodeCustomer newC = new NodeCustomer(new Customer(detail[0].trim(), detail[1].trim(), detail[2].trim()));
                    if (isCustomerEmpty()) {
                        cHead = cTail = newC;
                    }
                    cTail.next = newC;
                    cTail = newC;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            Assigment.showMes("\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
        }
        Assigment.showMes("\n----------LOAD DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }
    
    public void saveCustomer(String fname) {
        try {
            File file = new File(fname);
            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter myWriter = new FileWriter(fname)) {
                NodeCustomer customer = cHead;
                while (customer != null) {
                    String customerSave = String.format("\n\n%-5s|  %-12s|    %s", customer.info.getCcode(), customer.info.getCus_name(), customer.info.getPhone());
                    myWriter.write(customerSave + "\n");
                    customer = customer.next;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred when writing file.");
            Assigment.showMes("\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
        }
        Assigment.showMes("\n----------SAVE DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }

    public void addCustomer() {
        NodeCustomer newC = new NodeCustomer(new Customer("C10","Lan","1897"));
        if (isCustomerEmpty()) {
            cHead = cTail = newC;
            Assigment.showMes("\n----------ADD DONE!----------\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
            return;
        }
        cTail.next = newC;
        cTail = newC;
        Assigment.showMes("\n----------ADD DONE!----------\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }

    private void visitCustomer(NodeCustomer c) {
        if (c != null) {
            Assigment.displayCus(c.info);
            System.out.println();
        }
    }

    public void showCustomer() {
        NodeCustomer customer = cHead;
        while (customer != null) {
            visitCustomer(customer);
            customer = customer.next;
        }
        Assigment.showMes("\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }

    public NodeCustomer searchCustomer(String ccode) {
        NodeCustomer customer = cHead;
        while (customer != null) {
            if (customer.info.getCcode().equalsIgnoreCase(ccode)) {
                return customer;
            }
            customer = customer.next;
        }
        return null;
    }
    

    public void showCustomerByCode() {
        String ccode = Assigment.inputText("\nEnter Code: ");
        if (searchCustomer(ccode) != null) {
            visitCustomer(searchCustomer(ccode));
        } else {
            Assigment.showWar("\nCode not exist!");
            Assigment.showMes("\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
        }
        Assigment.showMes("\n");
        Assigment.inputText("Press \"Enter\" to back to menu!");
    }

     void removeFirstCustomer(){
       if(isCustomerEmpty()) return;
        cHead=cHead.next;
       if(cHead==null) cTail=null;
       
   }
    
    public void deleteCustomerByCode() {
        NodeCustomer customer = cHead;
        String ccode = Assigment.inputText("\nEnter Code: ");
        NodeBus bus = busHead;
         if(searchCustomer(ccode)==null) return;
         if(searchCustomer(ccode)==cHead){
             removeFirstCustomer();
             return;
         }
        if (searchCustomer(ccode) != null) {
            
            while (customer != null) {
                if (customer.next == searchCustomer(ccode)) {
                    customer.next = searchCustomer(ccode).next;
                    Assigment.showMes("\n----------DELETE DONE!----------\n");
                    Assigment.inputText("Press \"Enter\" to back to menu!");
                    return;
                }
                customer = customer.next;
            }
        } else {
            Assigment.showWar("\nCode not exist!");
            Assigment.showMes("\n");
            Assigment.inputText("Press \"Enter\" to back to menu!");
        }
    }
    
    
    
}
