 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExceptionHandling;

/**
 *
 * @author velmurugan
 */
public class sample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int a[]=new int[3];//0 1 2
        
           try//->block//catch or finally should be there with try otherwise will be error
        {
       
             a[3]=10;
           }
  
             catch(ArrayIndexOutOfBoundsException e)//catch is used=>will tell the error
       {
            System.out.println(e.getMessage());//or"Divide by zero"inside println
       }
    
    }
    }
    
