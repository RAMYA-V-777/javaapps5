/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 *
 * @author velmurugan
 */
public class Filewriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException.IOException{
        // TODO code application logic here
        FileWriter fw=new FileWriter("");
        String str="oops";
        fw.write(str);
        fw.write(97);
        char c[]=str.toCharArray();
        fw.write(c);
        fw.write();
        
    }
    
}
