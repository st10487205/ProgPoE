/*
        ST10487205
        NTOKOZO NHLAKANIPHO ZULU
        PROG5121 PoE PART 1
 */
package progpoe;

import java.util.Scanner;

public class ProgPoE {

    public static void main(String[] args) {
      //Variables
        String name, surname, username, password, phoneNumber, loginUsername, loginPassword;
        
      //Creating the scanner and method
        Scanner details = new Scanner(System.in);
        Login userDetails = new Login();
        
  /*CREATING A PROFILE*/  
    
    //prompt user for name and surname
        System.out.print("Enter your first name >> ");
        name = details.nextLine();
        userDetails.setName(name);
        
        System.out.print("Enter your surname >> ");
        surname = details.nextLine();
        userDetails.setSurname(surname);
        
      //prompt user and check username requirements
        System.out.print("Enter your username >> ");
        username = details.nextLine();
               

        while(!userDetails.validUsername(username)){
            System.out.println("Username is not correctly formatted, please ensure that"
               + " your username contains an underscore and is no more than 5 characters long.");
            System.out.print("Re-enter username >> "); 
            username = details.nextLine();
            userDetails.setUsername(username);         
            }
        userDetails.setUsername(username);

        
      //prompt user and check password requirements
        System.out.print("Enter you password >> ");
        password = details.nextLine();
        

        while(!userDetails.validPasswordComplexity(password)){
           System.out.println("Password is not correctly formatted, please ensure that"
               + " your password includes a capital letter, number, special character and at least 8 characters long.");
           System.out.print("Re-enter password >> ");
           password = details.nextLine();
           userDetails.setPassword(password);
        }  
        userDetails.setPassword(password);

      
      //prompt user and check phone number requirements
        System.out.print("Enter your phone number >> ");
        phoneNumber = details.nextLine();
        
        while(!userDetails.validPhoneNumber(phoneNumber)){
            System.out.println("Cellphone number incorrectly formatted or does not contain "
               + "(+27) international code and should not contain any letter(s).");
            System.out.print("Re-enter phone number >> ");
            phoneNumber = details.nextLine();
        }
        userDetails.setPhoneNumber(phoneNumber);                   
                    
    //Profile successfully created message
      if(userDetails.validPasswordComplexity(password) && userDetails.validPhoneNumber(phoneNumber)){
        System.out.println("\nProfile successfully created! \n===================\nProceed and enter your Login details.");
      }
        
  /*LOGIN*/
    //prompt user for username
      System.out.print("Enter your username to login >> ");
      loginUsername = details.nextLine();
      
     //checking if the username is correct 
      while(!userDetails.checkUserName(loginUsername)){
        System.out.println("Username incorrect, try again.");
        System.out.print("Re-enter username to login >> ");
        loginUsername = details.nextLine(); 
      }
      
     //prompt user for password if username is correct  
      System.out.print("Enter your password to login >> ");
      loginPassword = details.nextLine();

     //checking if the username is correct       
      while(!userDetails.validPasswordComplexity(loginPassword)){
        System.out.println("Password incorrect, try again.");
        System.out.print("Re-enter password to login >> ");
        loginPassword = details.nextLine();        
      }

   //if both the username and password is correct, the user logs in      
    if(userDetails.checkUserName(username) == true && userDetails.checkPassword(password) == true){
        System.out.println("Welcome " + userDetails.getName() + ", " + userDetails.getSurname() + " it is great to see you again.");
    } /*else {
        System.out.println("Username or password incorrect, please try again.");
    }*/      
         
  }
    
    
}
