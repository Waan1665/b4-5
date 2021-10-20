/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;
import java.util.Scanner;



public class Email_1 {
    private String firstName;
    private String lastName;
    private String depart;
    private String password;
    private int mailbox;
    private String email;
    private String alternateEmail; 
    private String changePass;
    

    public Email_1(String firstName, String lastName, String depart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.depart = depart;
        this.password = password;
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" 
                + depart + ".company.com";
    }
    public String getPassword() {
        return password;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getMailbox() {
        return mailbox;
    }

    public String getDepart() {
        switch(depart) {
            case "1":
                return "sale";
            case "2":
                return "development";
            case "3":
                return "accounting";
            default:
                return "";
        }                
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailbox(int mailbox) {
        this.mailbox = mailbox;
    }
    
    @Override
    public String toString() {
        return email; 
            
    }   
}
