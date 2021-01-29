/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 *
 * @author velmurugan
 */
public class OutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String str="java programming";
        bw.write(str);
        bw.flush();
        System.out.println(bw);
    }
    
}
