/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.ArrayList;

/**
 *
 * @author Buta
 */
public class StudentList extends ArrayList<Student> {
    public StudentList(){
        super();
        
    }
    public Student search(String code){
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) 
            if(this.get(i).getCode().equals(code)) return this.get(i);
        return null;
        
       }
    private boolean isCodeDupplicated(String code ){
        code = code.trim().toUpperCase();
        return search(code)!= null;
                
    }
    public void addStudent(){
        String newCode, newName;
        int newMark;
        boolean codeDupplicated = false;
        do{
            newCode = Inputter.inputPattern("Input code: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDupplicated = isCodeDupplicated(newCode);
            if(codeDupplicated)System.out.println("Code is dupplicated!");
            
        }
        while(codeDupplicated == true);
        newName = Inputter.inputNonBlackStr("Name of student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark : ", 0, 10);
        Student st = new Student(newCode,newName,newMark);
        this.add(st);
        System.out.println("Studen " + newCode+" has been added");
        
    }
    public void searchStudent(){
        if(this.isEmpty())
            System.out.println("Empty list.No search can be performed");
        else{
            String sCode = Inputter.inputStr("Input Student code for search:");
            Student st = this.search(sCode);
            if(st==null)
                System.out.println("Studen "+ sCode+" doesn't existed!");
            else System.out.println("Found : "+ st);
        }
    }
    public void updateStudent(){
        if(this.isEmpty()){
            System.out.println("Empty list. No search can be performed!");
        }
        else{
            String ucode = Inputter.inputStr("Input code of updateed student :");
            Student st = this. search(ucode);
            if(st==null)
                System.out.println("Student " + ucode +" doesn't existed !");
            else{
                String oldName = st.getName();
                String msg = "Old Name :" +oldName +", new Name : ";
                String newName = Inputter.inputNonBlackStr(msg);
                st.setName(newName);
                int oldMark = st.getMark();
                msg = "Old mark : " + oldMark + ", new Mark 0..10 : ";
                int newmark = Inputter.inputInt(msg, 0, 10);
                st.setMark(newmark);
                System.out.println("Student "+ ucode+" has been updated.");
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
                System.out.println("Student "+rcode+" doesn't existed !");
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
            System.out.println("Output: ");
            System.out.println("Studen list: ");
            for (Student st : this) {
                System.out.println(st);
            }
            System.out.println("Total : " + this.size()+ " Studen(s).");
        }
    }
}
