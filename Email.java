/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;
import java.util.ArrayList;

public class Email {
    private String firstName;
    private String lastName;
    private String depart;
    private String email;

    public Email(String firstName, String lastName, String depart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.depart = depart;
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" 
                + depart + ".company.com";
    }
  
    public String getEmail() {
        return email;
    }
    

  
    
    public static void main(String[] args) {
        ArrayList<Email_1> emailList = new ArrayList<Email_1>();
        
        Email_1 email1 = new Email_1("Quan", "Hoang", "Accouting");
        Email_1 email2 = new Email_1("Nguyen", "Thai", "Sale");
        Email_1 email3 = new Email_1("Tran", "Nghia", "Accouting");
       
        
        emailList.add(email1);
        emailList.add(email2);
        emailList.add(email3);
        
        for (Email_1 mail : emailList){
            System.out.println(mail.toString());
        }        
    }  
}
