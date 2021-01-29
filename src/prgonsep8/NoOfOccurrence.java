/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prgonsep8;

/**
 *
 * @author velmurugan
 */
public class NoOfOccurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="have a nice day";
        char c='a';
        int count=0;
        char c1[]=str.toCharArray();
        for(char cc : c1)
            if(cc==c)
                count++;
          System.out.println("a occurrence     "+count);
    }
    
}
