
public class Course {   
    private String name;
    private double fee;
    
    public Course() {
    }

 
    //add and complete you other methods (if needed) here   

    public Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
     
}
