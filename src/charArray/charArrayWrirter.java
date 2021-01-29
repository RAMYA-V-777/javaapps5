/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author velmurugan
 */
public class charArrayWrirter {//write thecontent inside the files

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        String str="oops class";
        CharArrayWriter cw=new CharArrayWriter();
        FileWriter fw=new FileWriter("path");
       // cw.write(str);//string writer
        cw.write(str,6,4);//string writer from given position
         System.out.println(cw);
        // cw.flush();------>not working so use fw instead fw
         char c[]={'a','b','c'};
        // cw.write(c);//char writer
         cw.write(c,1,1);//char writer from given position
          System.out.println(cw);
          cw.flush();
          cw.writeTo(fw);
          fw.flush();
    }
    
}
