/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    public Menu menu() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        
        System.out.println("@######  >>>>> MENU <<<<< ######@");
        System.out.println("||  1 - List Students          ||");
        System.out.println("||  2 - Student Detail         ||");
        System.out.println("||  3 - Add Student            ||");
        System.out.println("||  4 - Update Student         ||");
        System.out.println("||  5 - Remove Student         ||");
        System.out.println("||  6 - Exit Program           ||");
        System.out.println("@###############################@");
        System.out.print("Enter your choice: ");
        c = scanner.nextInt();
        
        switch (c) {
            case 1:
                StudentList studentList = new StudentList();
                studentList.getList();
                break;
            case 2:
                StudentDetail studentDetail = new StudentDetail();
                studentDetail.getDetail();
                break;
            case 3:
                StudentAdd studentAdd = new StudentAdd();
                studentAdd.addStudent();
                break;
            case 4:
                StudentUpdate studentUpdate = new StudentUpdate();
                studentUpdate.update();
                break;
            case 5:
                StudentDelete studentDelete = new StudentDelete();
                studentDelete.delete();
                break;
            case 6:
                System.out.println("EXITING ...");
                System.exit(0);
                break;
            default:
                System.out.println("WRONG MENU CONTENT!");
                break;
        }
        return null;
                
    }
    
}
