/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charArray;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

/**
 *
 * @author velmurugan
 */
public class ReadLineByLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO code application logic here
        //READ LINE BY LINE
        BufferedReader bf=new BufferedReader(new FileReader(""));
        String read;
        int i=1,count=0;
        String str[];
        while((read=bf.readLine())!=null)//return type is string so null no -1,sincw -1 is an integer
        {
            System.out.println(i+"."+read);//to get a line number along with the content of the file
            i++;
             if(read.contains("programming"));//if the line contains programmiing it will print
             {
                 System.out.println(read);
             }
            System.out.println("Line---------->"+read);
             str=read.split(" ");//split one sentence into words depending on space
            System.out.println("no of words in the line:"+str.length);
             for(i=0;i<str.length;i++)//IN ONE SENTENCE HOW MANY WORDS
            {
                System.out.println(str[i]);
                if(str[i].length()==1)//LENGTH OF EACH WORD
                    count++;
            }
        }
        System.out.println("One Letter Word:"+count);
        bf.close();
    }
    
}
