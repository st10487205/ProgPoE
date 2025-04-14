/*
    NTOKOZO NHLAKANIPHO ZULU
    ST10487205
    PROG5121 PoE
    JUnit Tests
 */
package progpoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class LoginTest {
    
    public LoginTest() {
    }
   

    /**
      Test of validUsername method, of class Login.
     */
    @Test
    public void testValidUsername() {
        System.out.println("validUsername");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validUsername(username);
        assertEquals(expResult, result);
        
    }

    /**
      Test of validPhoneNumber method, of class Login.
     */
    @Test
    public void testValidPhoneNumber() {
        System.out.println("validPhoneNumber");
        String phoneNumber = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validPhoneNumber(phoneNumber);
        assertEquals(expResult, result);

    }

    /**
      Test of validPasswordComplexity method, of class Login.
     */
    @Test
    public void testValidPasswordComplexity() {
        System.out.println("validPasswordComplexity");
        String Password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validPasswordComplexity(Password);
        assertEquals(expResult, result);

    }

    /**
      Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "kyl_";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);

    }

    /**
      Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String Password = "ch&&seC@ke99!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPassword(Password);
        assertEquals(expResult, result);

    }

    /**
      Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Login instance = new Login();
        String expResult = "Username is incorrectly formatted.";
        String result = instance.returnLoginStatus();
        assertEquals(expResult, result);

    }

    /**
      Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser();
        assertEquals(expResult, result);

    }
    
}
