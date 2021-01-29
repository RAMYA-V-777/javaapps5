/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InputOutputStreams;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author velmurugan
 */
public class ObjectInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*
        PORTION FOR IAT2:
        arraylist
        StringHandling
        Exception
        ByteStream
        */
       DataInputStream ds=new DataInputStream(System.in);
       ObjectOutputStream d=new ObjectOutputStream()
       System.out.println("Enter The No Of Fruits:");
       int n=Integer.parseInt(ds.readline());//readInt,and methods->to read from the file,TO AVOID ERROR USE THROWS
       fruit f[]=new fruit[n];
       for(int i=0;i<n;i++)//n=100,for loop run for 100 tmes
       {
           System.out.println("Enter name of the fruit:");
           name=ds.readline();
           System.out.println("Enter price of the fruit:");
           price=Double/*CLASS*/.parseDouble(ds.readLine());
           f[i]=new fruit(name,price);
           obj.w
       }
        //if use obj for clone and other methods it will show error->giving authorization to other to access my object we have to grant permission by implements serializable
    //reading the content->inputstream we need to use
       //print the content->info gets stored is obj(so need to check by values)by readobject()
       /*class must be present to read the obj,incaseb class not found,we have to use readobject() is used by classnotfound exception
      here input given by the object,output returned from the file
       read the obj->useObjectInputStream->specify the file here
       inorder to understand the object of types int,doble=>so specify thr object name(here fruit inside readObject
       in above point,without giving object name also t will run
       Giving ana authorisation->serialable
       writing obj->ObjectInputSTREM=>writeObject
       FileInputStream=>giving input to file
       File OutputStream=>giving output to file
       we cannot use write and read in byte or someother streams because of last two points
       setting path for file
       prgrm=>prop=>3 dot=>copy the path =>close
       go to the project in document and go to file of you and paste in the FileInputStream For chained exception for eg=>now prgrm will be as test prgrm;
       
       */
       
    }
    
}
    //CLASS fruit=>name+price->after finishing write the content into the file
    class fruit
    {
        String name;
        double price;
        fruit(String n,double p)
        {
            name=n;
            price=p;
        }
        public String toString()
        {
            return "Fruit Name:"+name+"Price:"+price;
        }
    }
}
