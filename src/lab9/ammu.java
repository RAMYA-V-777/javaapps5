/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab9;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class ammu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
         try
                             {
                 System.out.println("Enter the first integer:");                        int n=obj.nextInt();
                  System.out.println("Enter the second integer:");
                 int j=obj.nextInt();
                 int k=n/j;
                 k =Integer.parseInt( obj.next());
                System.out.println(k);
                System.out.println("No Exceptions!!!!!");
          }
          catch(ArithmeticException e)
          {
                System.out.println("Arithmetic Exception--->"+e);
          }
           try
          {
                int a[]=new int[5];
                a[11]=7;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
                System.out.println("ArrayIndexOutOfBounds Exception--->"+e);
          }
            try
          {
                 System.out.println("Enter the string:");
                 String y=obj.next();
                 int s=Integer.parseInt(y);
                 System.out.println(s);
                 System.out.println("No Exceptions!!!!!");
          }
           catch(NumberFormatException e)
           {
                 System.out.println("NumberFormat Exception--->"+e);
           }
             try
          {
                 System.out.println("Enter the string:");
                 String r=obj.next();
                  System.out.println(r.substring(78,67));
                 System.out.println("No Exceptions!!!!!");
          }
          catch(StringIndexOutOfBoundsException e)
          {
              System.out.println("StringIndexOutOfBounds Exception--->"+e);
          }
    }
    
}
