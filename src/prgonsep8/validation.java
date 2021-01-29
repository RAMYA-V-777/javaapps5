/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prgonsep8;

/**
 *
 * @author velmurugan
 */
public class validation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ramya@gmail.com->@ symbol is mail id
        //10 digit -->phn no
        //prg to check above both
       String str="ramyame1510@gmail.com";
       if(str.contains("@")&&str.contains("."))
           System.out.println("valid mail id");
       else
             System.out.println("invalid mail id");
       String phone="123456789";
       if(phone.length()==10)
             System.out.println("valid number");
       else
             System.out.println("invalid number");
           
    }
    
}
