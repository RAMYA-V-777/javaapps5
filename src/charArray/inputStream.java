/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
/**
 *
 * @author velmurugan
 */
public class inputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{//datainputstream,buffer
        // TODO code application logic here
        BufferedReader bs=new BufferedReader(new InputStreamReader(System.in));
        String name=bs.readLine();
        int rollno=Integer.parseInt(bs.readLine());
        float ff=Float.parseFloat(bs.readLine());
         System.out.println(name+"..."+rollno);
        
    }
    
}
