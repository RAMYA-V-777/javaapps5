/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Exception Handling:
Exception->An abnormal condition and will be terminated abruptly,we dont get proper o/p and error willl occur.
to handle this->Exception Handling is needed
Normal Statement->(wont affect our problems)no errror and very normal statement,no exceptions(since simple statements
eg:int i=10;
Crictical statement->posibility of error
eg:int i=j/k;//j=10,k=0;=10/0------>will be a exception
eg: int a[]=new int[3];
a[7]=10;------------>Exception arises here(Error)
Exception is a CLASS->
TYPES:
*Checked Exception->occor only in compile time
--->CloneNotSupportedException(memory)
--->only class no main class(file)
--->i/p and o/p exception ->(because of handling input devices)
--->SQL exception(regarding DataBase connectivity oriented)
--->remote exception->network problems((Other systems)->I/P address communicate with both the systems=>if some problem occurs,then its called remote exception
*Unchecked Exception->checked only during runtime it will be trying to check the value and if wrong,it will throw error
--->Arithmetic Exceptions
--->ArrayIndexOutOfBoundsException->checkindg index which is not present leads to error
--->NullPointerException(no value here,but giving value)
--->NumberFormatException->instead of int,if we give string,float means,it will return or throw an error
PROCEDURE OF WRITING:(HIERARCHY):
--------------------->OBJ CLASS IS A SUPER CLASS FOR ALL THE CLASSES
------------------>THROWABLE CLASS(sub class)
----------------------->THEN EXCEPTION CLASS
----------------------------->CHECKED EXCEPTION
---------------------->UNCHECKED EXCEPTION(INSIDE PRGRM WILL OCCUR)
error->Curreptable error,poweroff error,hardware error,virtual m/c.
keywords uesd in ExceptionHandling->try(used for crictical statements),catch,throw,throws,finally
*/

package ExceptionHandling;

/**
 *
 * @author velmurugan
 */
public class Exp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
