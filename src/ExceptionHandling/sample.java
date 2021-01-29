/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;
import java.util.*;


/**
 *
 @author velmurugan
         */
public class sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10;
        //int j=2;
        int j=0;//error->so put inside try
        Scanner obj=new Scanner(System.in);
        String s=null;//no value
        try//->block//catch or finally should be there with try otherwise will be error
        {
            int k=i/j;
            k=Integer.parseInt(obj.next());//get a string(conversion)
             System.out.println(k);
             s.substring(2);//NullPointerException
        }
       catch(ArithmeticException e)//catch is used=>will tell the error
       {
            System.out.println(e.getMessage());//or"Divide by zero"inside println
       }
        catch(NumberFormatException e)//catchblock
        {
            System.out.println(e);
        }
    }//catch will catch->1st catch, only one error in try,if need to know all the exceptions put exception we dont know in the last
    //if exception is not known,just give catch(Exception e)
    /*                                  {
    //                                         System.out.println(e)
    */                                     }

