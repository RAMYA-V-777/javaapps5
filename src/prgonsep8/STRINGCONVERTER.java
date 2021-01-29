/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prgonsep8;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class STRINGCONVERTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //78678908h890u=>o/p should be only numbers
        //Ascii value usage-->0-9=>48 to 57
        String str=new String();
       Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the string:");
        str=obj1.next();
        test obj=new test();
         System.out.println(obj.stringchecker(str));
    }
}
class test
{
   StringBuffer stringchecker(String str)
    {
        StringBuffer str1=new StringBuffer(str);
         for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)<48 || str1.charAt(i)>57)//Ascii value
            {
                str1.deleteCharAt(i);
                i--;
            }
        }
       return str1;
    }
}