/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatmessenger;

/**
 *
 * @author lab_services_student
 */
public class ChatMessenger {

    public static void main(String[] args) {
        Login user = new Login();
        
        user.setUsername("Lu_lu");
        user.setPassword("Pass123!");
        user.setPhoneNumber("+27831234567");
        
        System.out.println(user.registerUser());
        
        boolean login = user.loginUser("Lu_lu", "Pass123!");
        
        System.out.println(user.returnLoginStatus(login));
    }
}
