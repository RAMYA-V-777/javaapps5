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
public class swapno3rdvar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="oops";
        String str1="java";
       //substring
        str = str+str1;//8
        str1 = str.substring(0,str.length()-str1.length());//0,8-4
  
       str=str.substring(str1.length());//length of 2nd string(4)
         
                     System.out.println("After swap"+str+"...."+str1);
    }
    
}
