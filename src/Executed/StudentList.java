/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import Entity.Students;
import Model.StudentModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentList {
    private StudentModel sm = new StudentModel();
    public void getList(){
        ArrayList<Students> list = sm.getListStudents();
        System.out.println("@###### >>STUDENTS LIST<< ######@");
        System.out.println("ID\t||ROLLNUMBER\t||NAME\t\t\t||GENDER\t||STATUS");
        for (int i=0; i<list.size(); i++){
            Students students = list.get(i);
            System.out.print("||" + students.getId() + "\t");
            System.out.print("||" + students.getRollNumber() + "\t\t");
            System.out.print("||" + students.getName() + "\t\t");
            System.out.print("||" + (students.getGender()==0?"FEMALE":(students.getGender()==1?"MALE":"UNKNOWN")) + "\t\t");
            System.out.println("||" + (students.getStatus()==0?"ABSENT":"STUDING"));
        }
        System.out.println("@###############################@");
    }
}
