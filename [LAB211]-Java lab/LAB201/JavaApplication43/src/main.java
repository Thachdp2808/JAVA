/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mylist controll = new Mylist();
        Validate view = new Validate();
        int p = -1;
        while (p != 0) {
            p = view.MenuBus();
            switch (p) {
                case 1:
                    controll.loadBus("Bus.txt");
                    controll.showBus();
                    break;
                case 2:
                    controll.addBus();
                    controll.showBus();
                    break;
                case 3:
                    controll.showBus();
                    break;
                case 4:
                    controll.saveBus("Bus.txt");
                    break;
                case 5:
                    controll.loadBus("Bus.txt");
                    controll.visitBus(controll.searchBus("2"));
                    break;
                case 6:
                    controll.loadBus("Bus.txt");
                    controll.deleteBusBybcode("3");
                    controll.showBus();
                    break;
                case 7:
                    controll.loadBus("Bus.txt");
                    controll.sortByseat();
                    controll.showBus();
                    break;
                case 8:
                    controll.loadBus("Bus.txt");
                    controll.addBusPos(view.validateInt("\nEnter position: ", 0, controll.sizeBus()- 1));
                    controll.showBus();
                    break;
                case 9:
                    controll.loadBus("Bus.txt");
                    controll.deleteAfterCode(view.inputBusbCode());
                    controll.showBus();
                    break;
                case 10:
                    controll.loadBus("Bus.txt");
                    controll.updatebcode("2");
                    controll.showBus();
                    break;
                    
                case 0:
                    return;
            }
        }
        
        //Customer
        int q = -1;
        while (q != 0) {
            q = view.MenuCustomer();
            switch (q) {
                case 1:
                    controll.loadCustomer("Customer.txt");
                    controll.showCustomer();
                    break;
                case 2:
                    controll.addCustomer();
                    controll.showCustomer();
                    break;
                case 3:
                    controll.showCustomer();
                    break;
                case 4:
                    controll.saveCustomer("Product.txt");
                    break;
                case 5:
                    controll.showCustomerByCode();
                    break;
                case 6:
                    controll.deleteCustomerByCode();
                    controll.showCustomer();
                    break;
                case 0:
                    return;
            }
        }
    }
    
}
