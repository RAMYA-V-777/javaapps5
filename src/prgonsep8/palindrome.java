/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prgonsep8;

/**
 *
 * @author velmurugan
 */
public class palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="racecar";//madam
        char c[]=str.toCharArray();///0 r 1 a 2 c
        boolean flag=true;
        for(int i=0;i<c.length/2;i++)
        {
            if(c[i]!=c[c.length-1-i])
            {
                flag=false;
                break;
            }
        }
        if(flag)
              System.out.println("palindrome");
        else
              System.out.println("not a palindrome");
        
    }
  
    
}
