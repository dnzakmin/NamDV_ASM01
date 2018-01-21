/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import Entity.Students;
import Model.StudentModel;
import SqlConnection.ConnectionHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentUpdate {
    private StudentModel sm = new StudentModel();
    Date dnow = new Date(System.currentTimeMillis());
    SimpleDateFormat sDate = new SimpleDateFormat("hh:mm dd/MM/YYYY");
    public void update() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("@###### >>STUDENTS UPDATE<< ######@");
        System.out.println("ENTER ROLLNUMBER: ");
        String rollNumber = scanner.nextLine();
        StudentModel smodel = new StudentModel();
        Connection connection = ConnectionHelper.getConnection();
        
        
        while (true) {
        int c = 0;
        
        StudentModel sm = new StudentModel();
        ArrayList<Students> list = sm.getListStudents();
        for (int i=0; i<list.size(); i++){
            Students students = list.get(i);
            String rN = students.getRollNumber();
            if (rollNumber.equals(rN)) {
        
        System.out.println("@   SELECT INFORMATION TO UPDATE:   @");
        System.out.println("||  1 - Student's Name           || " + students.getName());
        System.out.println("||  2 - Student's Gender         || " + (students.getGender()==0?"FEMALE":(students.getGender()==1?"MALE":"UNKNOWN")));
        System.out.println("||  3 - Student's Birthday       || " + students.getBirthday());
        System.out.println("||  4 - Student's Email          || " + students.getEmail());
        System.out.println("||  5 - Student's Phone Number   || " + students.getPhone());
        System.out.println("||  6 - Student's Address        || " + students.getAddress());
        System.out.println("||  7 - Student's Status         || " + (students.getStatus()==0?"ABSENT":"STUDING"));
        System.out.println("||  8 - Cancel                   || ");
        System.out.println("@###################################@");
        
            }
        }
        System.out.print("Enter your choice: ");
        c = scanner.nextInt();
        scanner.nextLine();
        Statement statement = connection.createStatement();
        switch (c){
            case 1:
                System.out.print("Enter new Student's Full name: ");
                String name = scanner.nextLine();
                String updateName = "UPDATE students SET name = '" + name +"' WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateName);
                System.out.println("Name updated !");
                break;
            case 2:
                System.out.print("Enter new Student's Gender (0 for Female, 1 for Male): ");
                int gender = scanner.nextInt();
                scanner.nextLine();
                String updateGender = "UPDATE students SET gender = " + gender +" WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateGender);
                System.out.println("Gender updated !");
                break;
            case 3:
                System.out.print("Enter new Student's Birthday: ");
                String birthday = scanner.nextLine();
                String updateBirthday = "UPDATE students SET birthday = '" + birthday +"' WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateBirthday);
                System.out.println("Birthday updated !");
                break;
            case 4:
                System.out.print("Enter new Student's Email: ");
                String email = scanner.nextLine();
                String updateEmail = "UPDATE students SET email = '" + email +"' WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateEmail);
                System.out.println("Email updated !");
                break;
            case 5:
                System.out.print("Enter new Student's Phone number: ");
                String phone = scanner.nextLine();
                String updatePhone = "UPDATE students SET phone = '" + phone +"' WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updatePhone);
                System.out.println("Phone number updated !");
                break;
            case 6:
                System.out.print("Enter new Student's Address: ");
                String address = scanner.nextLine();
                String updateAddress = "UPDATE students SET address = '" + address +"' WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateAddress);
                System.out.println("Address updated !");
                break;
            case 7:
                System.out.print("Enter new Student's Status: ");
                int status = scanner.nextInt();scanner.nextLine();
                String updateStatus = "UPDATE students SET status = " + status +" WHERE rollNumber = '" + rollNumber + "';";
                statement.executeUpdate(updateStatus);
                System.out.println("Status updated !");
                break;
            case 8:
                break;
        }
        
            System.out.println("CONTINUE UPDATE INFORMATION (0: NO - 1: YES): ");
            int ct = scanner.nextInt();
            switch (ct){
                    
                case 0:
                    break;
                case 1:
                    continue;
                default:
                    System.out.println("CONTINUE UPDATE INFORMATION (0: NO - 1: YES): ");
                    break;
            }
            break;
        }
    }
}
