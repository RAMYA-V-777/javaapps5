

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class FileCopying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        FileInputStream fis=new FileInputStream("first4.txt");
         // String str="oops";
        //byte b[]=str.getBytes();//Ascii value will be present
        //fis.close();
        FileOutputStream fos=new FileOutputStream("first.txt");//desc
        int read;
        
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}