/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prgonsep8;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //listen,silent
        //covert to char
        //sort in ascending order
        //cmp the location of both(index)if matches then its anagram
        //length is equal
        Scanner obj=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter the two strings:");
        String s=obj.next();
        String s1=obj.next();
        s=s.toLowerCase().trim();//IF THIS CONDITION IT WILL CONSIDER BOTH CAPPS AND SMALL ALPHABET AS SAME
        s1=s1.toLowerCase().trim();
        char c[]=s.toCharArray();//convert string to character
        char c1[]=s1.toCharArray();
        //soting in ascending order     
        s2 obj1=new s2();
       c= obj1.sort(c);
        c1=obj1.sort(c1);
          System.out.println("After sorting:");
        for(int i=0;i<c.length;i++)
          System.out.println(c[i]);
         for(int i=0;i<c1.length;i++)
          System.out.println(c1[i]);
         for(int i=0;i<c.length;i++)
         {
             if(c[i]!=c1[i])
                 flag = false;
             //break;
         }if(flag)
              System.out.println("Anagrams");
         else
              System.out.println("Not a Aangram strings");
    }
    
}
class s2
{
    char[] sort(char c[])
    {
        char temp;
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return c;
    }
}