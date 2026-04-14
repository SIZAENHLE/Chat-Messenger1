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
        
        user.setUsername("kyl_1");
        user.setPassword("Ch&&sec@ke99!");
        user.setCellPhone("+27838968976");
        
        System.out.println(user.registerUser());
        
        boolean login = user.loginUser("kyl_1", "Ch&&sec@ke99!");
        
        System.out.println(user.returnLoginStatus(login));
    }
}
