/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import Entity.Students;
import Model.StudentModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentDetail {
    private StudentModel sm = new StudentModel();
    public void getDetail(){
        ArrayList<Students> list = sm.getListStudents();
        Scanner scanner = new Scanner(System.in);
        System.out.println("@###### >>STUDENTS DETAIL<< ######@");
        System.out.print("Student's Roll Number: ");
        String rollNumber = scanner.nextLine();
        for (int i=0; i<list.size(); i++){
            Students students = list.get(i);
            String rN = students.getRollNumber();
            if (rollNumber.equals(rN)) {
                System.out.println("Student's fullname: " + students.getName());
                System.out.println("Student's Sex: " + (students.getGender()==0?"FEMALE":(students.getGender()==1?"MALE":"UNKNOWN")));
                System.out.println("Student's Date of Birth: " + students.getBirthday());
                System.out.println("Student's Address: " + students.getAddress());
                System.out.println("Student's Status: " + (students.getStatus()==0?"ABSENT":"STUDING"));
            }
        }
        System.out.println("@###############################@");
    }
    
}
