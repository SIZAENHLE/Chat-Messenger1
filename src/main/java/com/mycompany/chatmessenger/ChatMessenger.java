/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatmessenger;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;

public class ChatMessenger {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Login user = new Login();
        
        System.out.println("Enter first name");
        user.setFirstName(input.nextLine());
        
        System.out.println("Enter last name");
        user.setLastName(input.nextLine());
        
        System.out.println("Enter username");
        user.setUsername(input.nextLine());
        
        System.out.println("Enter password");
        user.setPassword(input.nextLine());
        
        System.out.println("Enter cell phone number (+27):");
        user.setCellPhone(input.nextLine());
        
        System.out.println(user.registerUser());
        
        System.out.println("\n Login Section");
        
        System.out.println("Enter username");
        String loginUsername = input.nextLine();
        
        System.out.println("Enter username");
        String loginPassword = input.nextLine();
        
        //user.setUsername("kyl_1");
        //user.setPassword("Ch&&sec@ke99!");
        //user.setCellPhone("+27838968976");
        
        //System.out.println(user.registerUser());
        
        boolean loginStatus = user.loginUser(loginUsername,loginPassword);
        
        System.out.println(user.returnLoginStatus(loginStatus));
    }
}
