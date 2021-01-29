/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class demoexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i=10;
       int j=0;
   //    int a[]=new int[3];// 0 1 2
       Scanner obj=new Scanner(System.in);
      
     //  String s=null;
       try // try block ==> any no of catch block
       {
         int k=i/j;
         k =Integer.parseInt( obj.next());
         System.out.println(k);
       //  s.substring(2);
         //System.out.println(s.substring(5,50));
        
       }
     
       
       catch(ArrayIndexOutOfBoundsException e) //catch block
        {
           System.out.println(e);
        }
        catch(ArithmeticException e) //catch block
       {
           System.out.println(e);
       }
     
      
      
       catch(StringIndexOutOfBoundsException e) //catch block
        {
           System.out.println(e);
        }
              catch(NumberFormatException e) //catch block
       {
           System.out.println(e);
       }
    }
    
}
/*
 try
        {
        System.out.println(s.substring(5,50));
        }
        catch(Exception e)
        {
             System.out.println(e.getMessage());
        }
*/