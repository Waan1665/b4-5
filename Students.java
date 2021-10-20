/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.util.ArrayList;
import java.util.Scanner;


public class Students {
    public static ArrayList<Studentapp> myList = new ArrayList<Studentapp>();
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getList();
        
       
    }
    
    public static void getList() {
        System.out.println("So lương SV them vao danh sach");
        int number = sc.nextInt();sc.nextLine();
        int i = 0;
        while (i<number) {
            System.out.println("Nhap ten SV");
            String name = sc.nextLine();
            
            System.out.println("Nhap nam hoc");
            int year = sc.nextInt();sc.nextLine();
            
            System.out.println("Nhap ma hoc sinh");
            String ID = sc.nextLine();
            
            System.out.println("So tien SV da dong");
            int money = sc.nextInt();sc.nextLine();
            
            Studentapp people = new Studentapp(name, year, ID, money);
            myList.add(people);
            i++; 
        }   
    }
    public static String getCourse() {
        ArrayList<Studentapp> student = new ArrayList<Studentapp>();
        System.out.println("Nhap ma hoc sinh");
        String ID = sc.nextLine();
        for (Studentapp x : myList) {
            if (x.getID().contains(ID)) {
                student.add(x);
                
            }
        }
        System.out.println(student.toString());
        
        
        String subject = ("101Mathematics, 101English, 101Chemistry, 101 Computer science");
        String getSubject = sc.nextLine();
        if (student.get(0).getMoney()==200000){
            System.out.println("you are enroll");
            student.get(0).setMoney(student.get(0).getMoney()-200000);
            System.out.println(student.toString()+"\t"+getSubject);  
        }else {
            System.out.println("you don't have money");
            System.out.println("Do you have pay money");
            System.out.println("Yes or No");
            int say = sc.nextInt();sc.nextLine();
            
            if(say == 0) {
                return "Ban quay lai voi khoa hoc trong ngay gan nhat";       
            }else {
                System.out.println("Ban nhap so tien de tiep tuc");
                int payMoney = sc.nextInt();sc.nextLine();
                student.get(0).setMoney(payMoney);     
            }
      }    
        return "Gap lai sau";
    }
}
