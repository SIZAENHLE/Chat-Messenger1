/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.chatmessenger.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class NewChatJUnitTest {
    
    Login user = new Login();
    //average
    //username test
    //coment
    @Test
    public void testUsernameCorrectlyFormatted(){
        user.setUsername("kyl_1");
        assertTrue(user.checkUserName());
    }
    
    @Test
    public void testUsernameIncorrectlyFormatted(){
        user.setUsername("kyle!!");
        assertFalse(user.checkUserName());
    }
    
    //password test
    
    @Test
    public void testPasswordMeetsComplexity(){
        user.setPassword("Ch&&sec@ke99!") ;
        assertTrue(user.checkPasswordComplexity());
    }
    
    @Test
    public void testPasswordFailsComplexity(){
        user.setPassword("password");
        assertFalse(user.checkPasswordComplexity());
    }
    
    // Cellpjone number test
    
    @Test
    public void testCellPhoneCorrect(){
        user.setCellPhone("+27838968976");
        assertTrue(user.checkCellPhoneNumber());
    }
    
    @Test
    public void testCellPhoneIncorrect(){
        user.setCellPhone("08966553");
        assertFalse(user.checkCellPhoneNumber());
    }
    
    //Register
    
    @Test
    public void testRegisterUserSuccess(){
        user.setUsername("kyl_1");
        user.setPassword("Ch&&sec@ke99!");
        user.setCellPhone("+27838968976");
        
        assertEquals("User successfully registered.", user.registerUser());
    }
    
    @Test
    public void testRegisterUserFail(){
        user.setUsername("kyle!!!");
        user.setPassword("Ch&&sec@ke99!");
        user.setCellPhone("+27838968976");
        
        assertEquals("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", user.registerUser());
    }
    
    //Login
    
    @Test
    public void testLoginSuccess(){
        user.setUsername( "kyl_1");
        user.setPassword("Ch&&sec@ke99!");
        
        assertTrue(user.loginUser("kyl_1","Ch&&sec@ke99!"));
       
    }
    
     @Test
    public void testLoginFail(){
        user.setUsername( "kyl_1");
        user.setPassword("Ch&&sec@ke99!");
        
        assertFalse(user.loginUser("wrong","wrong"));
       
    }
    
}
