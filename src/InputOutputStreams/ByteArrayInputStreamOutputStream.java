/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InputOutputStreams;

/**
 *
 * @author velmurugan
 */
public class ByteArrayInputStreamOutputStream/*ByteArray->WILL ACT AS BOTH INPUT AND OUTPUT STREAM*/ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="Object Oriented Programming";
        byte b[]=str.getBytes();
     /*
                for some other streams=>read using followind syntax:
                int read;
                while((read=bs.read())!=-1)
                {
                Sys.out...(char)read)//type cast read to anymethod u need hera char
                }
                read->when using more than one time =>we have to use reset after finishing read one time=>sice irt points to the end of the file ,nothing will be printed if we donot use reset 
                ascii of b=97
                for both read and write we can give the loaction where to start and where to end
                
                */
    }
    
}
