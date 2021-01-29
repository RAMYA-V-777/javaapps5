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
public class finallydemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try//catch/finally should be there===>if no catch it'll be a error->so to handle this,we have to provide CATCH
            
        {
            int k=10,j=0;
            int i=k/j;
        }
     
        catch(Exception e)//try can have any number of catches
                {
                System.out.println(e);
                }
           finally
        {
            System.out.println("Finally Block");
        }
            
                
                
    }
    
}
