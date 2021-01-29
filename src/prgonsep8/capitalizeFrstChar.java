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
public class capitalizeFrstChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="have a nice day";
        String s[]=str.split("");
        String uppercase=" ";
        for(String s1:s)
        
           uppercase += Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ";
             System.out.println(uppercase);
        }
    }
    

