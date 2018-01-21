/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executed;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Login {
    public void login(){
    boolean c = true;
    while (c) {
   
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    
    System.out.println("APTECH FPT STUDENT MANAGER");
    System.out.print("USERNAME: ");
    username = input.next();

    System.out.print("PASSWORD: ");
    password = input.next();

        if(username.equals("Admin") && password.equals("123")){
        System.out.println("ACCESS GRANTED");
        
        c = false;
        break;
    } else {
        System.out.println("ACCESS REJECTED");
        
    }
    }
    }
}
