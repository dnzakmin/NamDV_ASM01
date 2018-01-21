/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import Model.StudentModel;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentDelete {
    private StudentModel sm = new StudentModel();
    public void delete() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("@###### >>STUDENTS DELETE<< ######@");
        System.out.println("ENTER ROLLNUMBER: ");
        String rollNumber = scanner.nextLine();
        StudentModel smodel = new StudentModel();
        smodel.deleteStudent(rollNumber);
    }

}
