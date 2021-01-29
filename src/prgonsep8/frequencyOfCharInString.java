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
public class frequencyOfCharInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //occurrence of all the characters in sentence
        String str="have a nice day";
             int length,count;
             char c[];
             do
             {
                 c=str.toCharArray();
                 length=c.length;
                 count=0;
                 for(int i=0;i<length-1;i++)
                 {
                     if(c[0]==c[i])
                         count++;
                 }
                 if(count!=0)
                 
                     System.out.println(c[0]+"................"+count+" times");
                 str = str.replace(""+c[0], "");//since str is a string and c is a character,to avoid error concatnate it and this line is for removing the character
 
             }while(length!=1);
}
}
