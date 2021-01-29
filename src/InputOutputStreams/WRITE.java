/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InputOutputStreams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
public class WRITE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            File f=new File("first4.txt");
        FileOutputStream fos=new FileOutputStream("first4.txt",true);//we have to provide the possibilities before running=>true->(running frequently will append the info)
        //
        String str="oooooooooooooooooo";
        byte b[]=str.getBytes();//Ascii value will be present
        fos.close();
      FileInputStream fis=new FileInputStream("first4.txt");
       // System.out.println(fis.read());//ascii value
        //System.out.println((char)fis.read());//print as character
        int read;
       //fis.read();
        while((read=fis.read())!=-1)///-1->represents end of character(EOF)-->end of a file
        {
            System.out.println((char)read);
        }
         fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
     
    }
    
}
