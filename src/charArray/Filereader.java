/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author velmurugan
 */
public class Filereader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO code application logic here
        FileReader fd=new FileReader("C:\\Users\\velmurugan\\Documents\\NetBeansProjects\\UNIT33\\src\\charArray\\Filereader.java");
      //READ CHAR BY CHAR
        /*  int read,count=1;
        while((read=fd.read())!=-1)//read char by char
        {
            if((char)read=='\n')
                count++;
            //System.out.println((char)read);
        } 
        System.out.println(count);*/
    fd.close();
    
}
}
