/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;
public class sample3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        /*prgrm->get input through command prompt
        a,b=>add
        check:
             *NumberFormatException
             *ArrayOutOfBoundsException=>SINCE IN CMDPROMPT WE HAVE TO RUN THROUGH PROJECTS
        BY->projects->properties->browse->select prgrm->in argument->give the inputs
        TO RUN->projects->run*/
        try
        {
       int a =Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);
       System.out.println(a+b);
        }
     /*   catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
              System.out.println(e.getMessage());
        }*/
        catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
              System.out.println(e.getMessage());
        }
        
    }
    
}

