/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex9;
import java.util.*;

/**
 *
 * @author Desktop pc
 */
public class excep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
          try
                             {
                 System.out.println("Enter the first integer:");                        
                 int y=obj.nextInt();
                  System.out.println("Enter the second integer:");
                 int x=obj.nextInt();
                 int z=y/x;
                z=Integer.parseInt( obj.next());
                System.out.println(z);
                
          }
          catch(ArithmeticException e)
          {
                System.out.println("Arithmetic Exception--->"+e);
          }
             try
          {
                int a[]=new int[9000];
                a[110000000]=7;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
                System.out.println("ArrayIndexOutOfBounds Exception--->"+e);
          }
             try
          {
                 System.out.println("Enter str:");
                 String u=obj.next();
                 int v=Integer.parseInt(u);
                 System.out.println(v);
               
          }
           catch(NumberFormatException e)
           {
                 System.out.println("NumberFormat Exception--->"+e);
           }
              try
          {
                 System.out.println("Enter the string:");
                 String t=obj.next();
                  System.out.println(t.substring(1,6));
               
          }
          catch(StringIndexOutOfBoundsException e)
          {
              System.out.println("StringIndexOutOfBounds Exception--->"+e);
          }
    }
    
}
