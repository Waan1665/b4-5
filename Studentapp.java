/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author ThinkPad
 */
public class Studentapp {

    
    private String nameStudent;
    private int year;
    private String ID;
    private String subject;
    private int money;

    public Studentapp(String nameStudent, int year, String ID, int money) {
        this.nameStudent = nameStudent;
        this.year = year;
        this.ID = ID;
        this.money = money;
    }

    public Studentapp(String nameStudent, int year, String ID, String subject, int money) {
        this.nameStudent = nameStudent;
        this.year = year;
        this.ID = ID + year; 
        this.subject = subject;
        this.money = money;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-13s%-13s%-10s",getNameStudent(),
                getYear(),getID(),getMoney());
    }
    
    
    
    
  
     
    
    
    
    
    
}
