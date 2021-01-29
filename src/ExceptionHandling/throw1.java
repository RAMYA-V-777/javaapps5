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
public class throw1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b=10,c=10;
        try
        {
        a=b/c;
       throw new ArithmeticException("/ by zero");//->because of throw,try is coming to catch
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    
}
}