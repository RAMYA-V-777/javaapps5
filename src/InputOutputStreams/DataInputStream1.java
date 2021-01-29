/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InputOutputStreams;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
public class DataInputStream1/*->STORING INFORMATION IN THE FORM OF PRIMITIVE DATATYPES */ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException; {
        // TODO code application logic here
        DataInputStream1 ds=new DataInputStream1(System.in);//frst 3 statements can be used to get the value instead of Scanner class
        System.out.println("Enter Value");
        System.out.println();
    }
    
}
