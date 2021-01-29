/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit33;

/**
 *
 * @author velmurugan
 */
public class TestFirstApp {

public int doThis (int inp) {

int [] wer {2, 3, 3, 7, 7, 7, 13, 3, 17, 3, 3, 3, 3};

int curCount = 0, curMax = 0;

boolean inBlock = false; // Statement A

for (int i=0; i < wer.length; i++)

{

if (wer[i]== inp) {

inBlock true; //Statement B

curCount++;

continue ; // Statement C

}

else {

if (inBlock) {

if (curCount > curMax) {

curMax = curCount;

curCount = 0;

inBlock = false; // Statement D

continue; // Statement E

}

else

{ inBlock = false; // Statement F

 curCount = 0; // Statement G

continue; // Statement H

} } } }

return curMax; // Statement I

}

public static void main(String[] args) {

          labell: for (int i=0; i<5; ++i)

                     label2: for (int j=0; j<3; ++j)

                     {

                      if (j<=i)

                       {

                       System.out.print(j);

                       continue labell;

                      }

                   else

                  break label2; } } }