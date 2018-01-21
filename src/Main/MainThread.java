/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Executed.*;
import SqlConnection.ConnectionHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Main Thread - Program Excecuted 
 * @author NamDV
 */
public class MainThread {
    public static void main(String[] args) throws SQLException {
        
        Login login = new Login();
        login.login();
        
        Connection connection = ConnectionHelper.getConnection();
        if (connection == null){
            System.out.println("ERROR");
        }
     
        while (true){
            Scanner scanner = new Scanner(System.in);
            Menu menu = new Menu();
            menu.menu();
            System.out.println("CONTINUE PROGRAM (0: NO - 1: YES): ");
            int c = scanner.nextInt();
            switch (c){
                    
                case 0:
                    System.out.println("EXIT PROGRAM !");
                    System.exit(0);
                    break;
                case 1:
                    continue;
                default:
                    System.out.println("CONTINUE PROGRAM (0: NO - 1: YES): ");
                    break;
            }
                
    }
    }
    
}
