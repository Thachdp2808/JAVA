/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author MANH HUNG
 */
import java.util.ArrayList;
public class StudentList extends ArrayList<Student>{

    public StudentList() {
        super();
    }
    public Student search(String code){
        code = code.trim().toUpperCase();
        for(int i = 0; i < this.size(); i++){
            if(this.get(i).getCode().equals(code)) return this.get(i);
        }
        return null;
    }
    
    public void addStudent(){
        String newCode; String newName;
        int newMark;
        boolean codeDuplicated = false;
        do{
            newCode = Inputter.inputPattern("ST. code S000", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            if(codeDuplicated)System.out.println("Code is duplicated!");
        }
        while(codeDuplicated == true);
        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        
        newMark = Inputter.inputInt("Mark: ", 0, 10);
        
        Student st = new Student(newCode, newName, newMark);
        this.add(st);
        System.out.println("Student: " + newCode + "has been added");
        
    }
    public void searchStudent(){
        if(this.isEmpty())
            System.out.println("Empty list. No search can be performed!");
        else{
            String sCode = Inputter.inputStr("Input student code for search: ");
            Student st = this.search(sCode);
            if(st == null){
                System.out.println("Studen " + sCode + "doesn't existed !");
                
            }
            else System.out.println("Found: " + st);
        }
            
    }
    public void updateStudent(){
        if(this.isEmpty()){
            System.out.println("Empty list. No update can be performed!");
        }
        else{
            String uCode = Inputter.inputStr("Input student code for search: ");
            Student st = this.search(uCode);
            if(st == null){
                System.out.println("Studen " + uCode + "doesn't existed !");
                
            }
            else {
                String oldName = st.getName();
                String msg = "oldName: " + oldName + ",new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);
                
                int oldMark = st.getMark();
                msg = "Old mark: " + oldMark + ", new mark 0..10: ";
                int newMark = Inputter.inputInt(msg, 0, 10);
                st.setMark(newMark);
                System.out.println("Student " + uCode + " has been update.");
            }
            
        }
    }
   public void removeStudent(){
        if(this.isEmpty()){
            System.out.println("Empty list. No search can be performed!");
        }
        else{
            String rcode = Inputter.inputStr("Input code of remove student : ");
           Student st = this.search(rcode);
           if(st== null)
                System.out.println("Student "+ rcode+"  doesn't existed !");
           else{
               this.remove(st);
               System.out.println("Student "+ rcode+" has been removed.");
           }
        }
    }
    public void printAll(){
        if(this.isEmpty()){
            System.out.println("Empty list.");
        }
        else{
            System.out.println("Studen list :");
            for (Student st : this) {
                System.out.println(st);
            }
            System.out.println("Total : " + this.size()+ "Studen(s).");
        }
    }
    

    
    
}