/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
public class intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str="java programming";
        char c[]=str.toCharArray();
        //char c[]=
        CharArrayReader ca=new CharArrayReader(c);//str will be in ca
        int read;
        char c1[]=new char[8];//upto 8th location
      //  ca.read(c1);//from obj ca,content will be moved on to c1 array-->when ca have to read bulk informations but not single character at a time->so we are creating this array
        ca.read(c1,3,5);//destination array,from 3rd store 5 characters=>space is the frst character
        for(char r:c1)
             System.out.println(r);
       /* while((read=ca.read())!=-1)//reading character by character
            System.out.println((char)read);//unicode values,IF NEED CHARACTER CAST TO CHARACTER
       /* ca.reset();//array//buffer
        ca.skip(5);
        while((read=ca.read())!=-1)
             System.out.println((char)read);*/
    }
    
}
