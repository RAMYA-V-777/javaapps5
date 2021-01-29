/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class Excep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner obj = new Scanner(System.in);
        System.out.println("Enter name:");
        String n = obj.next();  
        System.out.println("Enter age:");
        int age = obj.nextInt();
        System.out.println("Enter mail:");
        String mail = obj.next();
        try
        {
            person g=new person(n);
            g.check();
        }
        catch(Exception t)
        {
            System.out.println(t.getMessage());
        }
        
        
}
}
class person
{
    String name;
    int age;
    String mail;
   person(String k)
   {
   
   name=k;
   }
void check() throws Exception
{
    for(int i=0;i<name.length();i++)
        {
            if(((name.charAt(i)>=97)&&(name.charAt(i)<=122)) || ((name.charAt(i)<=90)&&(name.charAt(i)>=65)))//Ascii value
            {
                
              
            }
            else
            {
                throw new Exception("NameIncorrectFormatException->" + name);
                 
            }
        }
  
}
}
class NameIncorrectFormatException extends Exception
{

    NameIncorrectFormatException(String n)
    {
        super(n);
    }
}
