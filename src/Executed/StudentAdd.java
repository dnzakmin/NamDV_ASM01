package Executed;


import Model.StudentModel;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class StudentAdd {
    StudentModel smodel = new StudentModel();
    public void addStudent() throws SQLException{
        Date dnow = new Date(System.currentTimeMillis());
        SimpleDateFormat sDate = new SimpleDateFormat("hh:mm dd/MM/YYYY");
        Scanner scanner = new Scanner(System.in);
        System.out.println("######   ADD STUDENT ######");
        
        System.out.print("Student Roll Number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Student Gender (0 for Female, 1 for Male): ");
        int gender = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Student Birthday: ");
        String birthday = scanner.nextLine();
            
        System.out.print("Student Email: ");
        String email = scanner.nextLine();

        
        System.out.print("Student Phone Number: ");
        String phone = scanner.nextLine();
        
        System.out.print("Student Address: ");
        String address = scanner.nextLine();
        
        System.out.print("Student Status: ");
        int status = scanner.nextInt();
        
        String createAt = sDate.format(dnow.getTime());
        
        
        smodel.addStudent(rollNumber, name, gender, birthday, email, phone, address, createAt, status);
    }
    
}
