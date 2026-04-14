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
    private String cellPhone;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setCellPhone(String phoneNumber){
        this.cellPhone = cellPhone;
    }
    
    public boolean checkUserName(){
        return username.contains("_")&& username.length()<=5;
    }
    
    public boolean checkPasswordComplexity(){
        return password.length()>=8 &&
                password.matches(".*[A-Z].*")&&
                password.matches(".*[0-9].*")&&
                password.matches(".*[!@#$%^&*()].*");
    }
    
    public boolean checkCellPhoneNumber(){
        //return cellPhone.startsWith("+27")&& cellPhone.length()== 12;
        return cellPhone.matches("^\\+27[0-9]{9}$");
    }
    
    public String registerUser(){
        
        if(!checkUserName()){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length. ";
        }
        
        if(!checkPasswordComplexity()){
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        
        if(!checkCellPhoneNumber()){
            return "Cellphone number is not correctly formatted or does not contain international code.";
        }
        
        return "User successfully registered";
    }
    
    public boolean loginUser(String inputUsername, String inputPassword){
        return inputUsername.equals(username)&& inputPassword.equals(password);
    }
    
    public String returnLoginStatus(boolean loginSuccess){
        if(loginSuccess){
            return "Welcome" + username +", it is great to see you again!";
        }else{
            return "Username or password incorrect, please try again.";
        }
    }
    
}
