/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedefinedException;

/**
 *
 * @author V.RAMYA
 */
public class MarkExceptionPrgrm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarkExceptionPrgrm obj=new MarkExceptionPrgrm();
        try
        {
        obj.checker();
        }
        catch(MarkException1 e)
        {
            System.out.println(e);
        }
       
    }
    void checker() throws MarkException1
    {
        // mark cal. [0-100]
        int sub1=10;
        if(sub1<0 || sub1>100)
            throw new MarkException1("Invalid mark");
    }
}
class MarkException1 extends Exception
{
    String message;
    MarkException1(String msg)
    {
     //  message = msg;
       super(msg); // calling super class(Exception) constructor
    }
   /* public String toString()
    {
        return message;
    }*/
}