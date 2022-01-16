
public class Seller extends Employee {  
    private double revenue;
    
    public Seller() {
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    
     /*Complete the below function for second test case*/
    public double getSalary(){
        double salary = 0;
        if (this.revenue < 30000){
            salary = super.getSalary() + revenue * 0.0005;
        }else{
            salary = super.getSalary() + revenue * 0.00001;
        }
        if (super.getName().toLowerCase().startsWith("c")){
            salary = Math.ceil(salary);
        }else{
            salary = Math.floor(salary);
        }
        return salary;
    }
    //add and complete your other methods here (if needed)
    
}
