/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Report;
import model.Student;


public class ManageStudent {

    List<Student> listStudent = new ArrayList<>();
    List<Report> listReport = new ArrayList<>();
    
    /**
     * this function use to get size of list students
     * @return size of list student
     */
    public int getSize() {
        return listStudent.size();
    }
    
    /**
     * this function use to get list student
     * @return listStudent
     */
    public List<Student> getListStudent() {
        return listStudent;
    }
    
    /**
     * this function use to check 1 ID only have 1 name
     * @param id
     * @param name
     * @return 
     */
    public boolean checkNameValid(String id, String name) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)
                    && !student.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }
    
    
    /**
     * this function use to add an student into list 
     * @param student 
     */
    public void addStudent(Student student) {
        listStudent.add(student);
    }
    
    /**
     * this function use to check duplicate
     * @param id
     * @param name
     * @param semester
     * @param age
     * @param course
     * @return true or false
     */
    public boolean checkDuplicate(String id, String name, int semester, int age, int course) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)
                    && student.getName().equalsIgnoreCase(name)
                    && student.getSemester() == (semester)
                    && student.getAge() == (age)
                    && student.getCourse() == (course)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * this function use to sort 
     * @param list 
     */
    public void sortByAge(List<Student> list) {
        /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < list.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (list.get(j).getAge() > list.get(j + 1).getAge()) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }
    
    /**
     * this function use to get all student have same name with list
     * @param name
     * @return listSearch
     */
    public List<Student> getListStudentByName(String name) {
        List<Student> listSearch = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getName().toUpperCase().contains(name.toUpperCase())) {
                listSearch.add(student);
            }
        }

        return listSearch;
    }
    
    /**
     * this function use to get students by ID
     * @param id
     * @return listsearch
     */
    public List<Student> getListStudentByID(String id) {
        List<Student> listSearch = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getId().toUpperCase().equalsIgnoreCase(id.toUpperCase())) {
                listSearch.add(student);
            }
        }

        return listSearch;
    }
    
    /**
     * this function use to remove all student
     * @param student 
     */
    public void removeStudent(Student student) {
        listStudent.remove(student);
    }
    
    /**
     * this function use to update all name in list
     * @param id
     * @param name 
     */
    public void updateAllName(String id, String name) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id) && !student.getName().equalsIgnoreCase(name)) {
                student.setName(name);
            }
        }
    }
    
    /**
     * this function use to check user not update
     * @param student
     * @param id
     * @param name
     * @param semester
     * @param courseName
     * @param age
     * @return 
     */
    public boolean checkNotUpdate(Student student, String id, String name, int semester, int courseName, int age) {
        if (student.getId().equalsIgnoreCase(id)
                && student.getName().equalsIgnoreCase(name)
                && student.getSemester() == (semester)
                && student.getAge() == (age)
                && student.getCourse() == (courseName)) {
            return true;
        }else {
            return false;
        }
        
    }
    
    /**
     * this function use to add an report to list
     * @param report 
     */
    public void addReport(Report report) {
        listReport.add(report);
    }
    
    /**
     * this function use to get a list report
     * @return 
     */
    public List<Report> getListReport() {
        return listReport;
    }
    
    /**
     * this function use to check a report exist
     * @param firstStudent
     * @param listReport
     * @return 
     */
    public boolean checkExistReport(Student firstStudent, List<Report> listReport) {
         for (Report report : listReport) {
            if (report.getId().equalsIgnoreCase(firstStudent.getId())
                    && report.getCourse() == (firstStudent.getCourse())) {
                return true;
            }
        }
        return false;
    }

    public Student getStudentByID(String id) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateAllAge(String id, int age) throws Exception {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)) {
                student.setAge(age);
            }
        }
    }

}
