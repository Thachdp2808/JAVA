/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageStudent;
import java.util.List;
import model.Report;
import model.Student;

public class View_Student {

    ManageStudent manage = new ManageStudent();

    /**
     * this function use to get user input information of student
     */
    void input() {
        if (manage.getSize() >= 5) {
            if (checkYesNo() == false) {
                return;
            }
        }

        //input properties
        String id = getId();
        Student studentInList = manage.getStudentByID(id);
        String name;
        while (true) {
            name = getName();
            //check name valid
            if (manage.checkNameValid(id, name)) {
                break;
            } else {
                System.out.println("Name is not valid !!");
            }
        }
        int semester = getSemester();
        int age;

        if (studentInList == null) {
            age = getAge();
        } else {
            age = studentInList.getAge();
        }

        int course = getCourse();

        if (manage.checkDuplicate(id, name, semester, age, course)) {
            System.out.println("DUPLICATE !!");
        } else {
            Student student = new Student(id, name, age, semester, course);
            manage.addStudent(student);
        }

    }

    /**
     * get id from user input
     *
     * @return id
     */
    private String getId() {
        String id = Ultility.getString("Enter id: ", "Wrong", Ultility.REGEX_STRING);
        return id;
    }

    /**
     * get name from user input
     *
     * @return name
     */
    private String getName() {
        String name = Ultility.getString("Enter name: ", "Wrong", Ultility.REGEX_STRING);
        return name;
    }

    /**
     * get semester from user input
     *
     * @return semester
     */
    private int getSemester() {
        int semester = Ultility.getInt("Enter semester: ", "Wrong", 0, 15);
        return semester;
    }

    /**
     * get age from user input
     *
     * @return age
     */
    private int getAge() {
        int age = Ultility.getInt("Enter age: ", "Wrong! ", 16, 100);
        return age;
    }

    /**
     * get course from user input
     *
     * @return course
     */
    private int getCourse() {
        int course = Ultility.getInt("Enter course\n (1:Java\n 2:.NET \n 3: C/C++): ", "Wrong", 1, 3);
        return course;
    }

    /**
     * get yes or no
     *
     * @return true or false
     */
    private boolean checkYesNo() {
        String result = Ultility.getString("Do you want to continue (Y/N)?: ", "Must be y or n", Ultility.REGEX_Y_N);
        if (result.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    /**
     * find a student by name input and sort it
     */
    void findAndSort() {
        String name = getName();

        List<Student> listSearch = manage.getListStudentByName(name);
        if (listSearch.size() == 0) {
            System.out.println("NOT FOUND");
        } else {
            manage.sortByAge(listSearch);
            displayListStudent(listSearch);
        }

    }

    /**
     * display list student
     *
     * @param listSearch
     */
    private void displayListStudent(List<Student> listSearch) {
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "ID", "Name", "Age", "Semester", "Course");
        for (Student student : listSearch) {
            System.out.println(student);
        }
    }

    /**
     * this function use to update or delete from user input u or d
     */
    void updateOrDelete() throws Exception {
        String id = getId();

        List<Student> listSearch = manage.getListStudentByID(id);
        if (listSearch.size() == 0) {
            System.out.println("NOT FOUND");
        } else {
            //true => update
            //false => delete
            if (checkUpdateOrDelete()) {
                updateStudent(listSearch);
            } else {
                deleteStudent(listSearch);
            }
        }

    }

    /**
     * ask user want to update or delete
     *
     * @return true or false
     */
    private boolean checkUpdateOrDelete() {
        String result = Ultility.getString("Do you want to update (U) or delete (D) ?: ", "Must be u or d", Ultility.REGEX_UD);
        if (result.equalsIgnoreCase("u")) {
            return true;
        }
        return false;
    }

    /**
     * update student
     *
     * @param listSearch
     * @throws Exception
     */
    private void updateStudent(List<Student> listSearch) throws Exception {
        //initalize 
//        String id = null, name = null;
//        int age = 0, semester = 0, courseName = 0;

        displayListFoundByID(listSearch);
        int choice = Ultility.getInt("Enter ordinal you want to update: ", "Wrong", 1, listSearch.size());
        //find student want to update
        Student student = listSearch.get(choice - 1);
        String id = student.getId();
        String name = student.getName();
        int age = student.getAge();
        int semester = student.getSemester();
        int courseName = student.getCourse();

        //check want to update properties
        if (checkWantToUpdate("id")) {
            id = getId();
        }

        if (checkWantToUpdate("name")) {
            name = getName();
        }

        if (checkWantToUpdate("semester")) {
            semester = getSemester();
        }
        if (checkWantToUpdate("age")) {
            age = getAge();
        }
        if (checkWantToUpdate("course")) {
            courseName = getCourse();
        }

        if (manage.checkDuplicate(id, name, semester, age, courseName)) {
            System.out.println("DUPLICATE");
        } else {
            student.setId(id);
            manage.updateAllName(id, name);
            student.setSemester(semester);
            manage.updateAllAge(id, age);
            student.setCourseName(courseName);
        }

    }

    /**
     * report student
     */
    void report() {
        manage.getListReport().clear();
        for (Student firstStudent : manage.getListStudent()) {
            int total = 0;
            for (Student secondStudent : manage.getListStudent()) {
                if (firstStudent.getId().equalsIgnoreCase(secondStudent.getId())
                        && firstStudent.getCourse() == (secondStudent.getCourse())) {
                    total++;
                }

            }
            if (manage.checkExistReport(firstStudent, manage.getListReport()) == false) {
                manage.addReport(new Report(firstStudent.getId(), firstStudent.getName(),
                        firstStudent.getCourse(), total));
            }
        }
        System.out.printf("%-20s | %-10s | %-10s\n", "Name", "Course", "Total Course");
        for (Report report : manage.getListReport()) {
            System.out.println(report);
        }
    }

    /**
     * delete a student
     *
     * @param listSearch
     */
    private void deleteStudent(List<Student> listSearch) {
        displayListFoundByID(listSearch);

        int choice = Ultility.getInt("Enter ordinal you want to delete: ", "Wrong", 1, listSearch.size());
        Student student = listSearch.get(choice - 1);
        manage.removeStudent(student);

    }

    /**
     * display list student found by ID
     *
     * @param listSearch
     */
    private void displayListFoundByID(List<Student> listSearch) {
        System.out.printf("%-10s %-10s %-20s %-10s %-10s %-10s\n", "No", "ID", "Name", "Age", "Semester", "Course");

        for (int i = 1; i <= listSearch.size(); i++) {
            System.out.printf("%-10s %s\n", i, listSearch.get(i - 1));
        }

    }

    /**
     * check user want to update or not
     *
     * @param message
     * @return true or false
     */
    private boolean checkWantToUpdate(String message) {
        String result = Ultility.getString("Do you want to update " + message + " (y/n)? ",
                "ONLY y or n !!!", Ultility.REGEX_Y_N);
        //if result == y => true
        //else => false 
        if (result.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

}
