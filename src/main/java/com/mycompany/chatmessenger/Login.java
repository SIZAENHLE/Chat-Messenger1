/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatmessenger;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
    //variables to store user data
    private String username;
    private String password;
    private String phoneNumber;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public boolean checkUsername(){
        return username.contains("_")&& username.length()<=5;
    }
    
    public boolean checkPasswordComplexity(){
        return password.length()>=8 &&
                password.matches(".*[A-Z].*")&&
                password.matches(".*[0-9].*")&&
                password.matches(".*[!@#$%^&*()].*");
    }
    
    public boolean checkCellPhoneNumber(){
        return phoneNumber.startsWith("+27")&& phoneNumber.length()== 12;
    }
    
    public String registerUser(){
        
        if(!checkUsername()){
            return "Username is not correctly formatted.";
        }
        
        if(!checkPasswordComplexity()){
            return "Password is not correctly formatted.";
        }
        
        if(!checkCellPhoneNumber()){
            return "Cellphone number is not correctly formatted.";
        }
        
        return "User successfully registered";
    }
    
   
    
    
}
