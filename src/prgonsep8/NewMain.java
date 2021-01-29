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

        // TODO code application logic here
       import java.io.ByteArrayInputStream;
import java.io.IOException;

public class 
        NewMain

{ public void doIt(int m, int n)

{

int k;

k=m;

m=n;

n=k;

System.out.print (m);

return; }

public static void main(String[] args) {

int m=3, n=5;

 NewMain myObj=new  NewMain();

myObj.doIt (m,n);

System.out.print (m);

} }