/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author velmurugan
 */
public class Copyfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO code application logic here
        FileReader fd=new FileReader("");
        FileWriter fw=new FileWriter("");
        int read;
        while((read=fd.read())!=-1)
            fw.write(read);//writing inside the file
                    
                    
                    fd.close();
                    fw.close();
                    //
    }
    
}
