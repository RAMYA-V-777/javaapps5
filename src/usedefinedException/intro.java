/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usedefinedException;

/**
 *
 * @author velmurugan
 */
/*
in JVM->automatic exception handling is present
for exception->Main cllass is THROWABLE CLASS
Programming errors are handled by->try,catch,throw,throws,finally keywords
throws->not handled error->suppress the error->tell the possiblity of error
->should be used in method only 
accessing other software,resources->finally->close outside resources in safe manner
USERDEFINED EXCEPTION/CUSTOM EXCEPTION:
->Exception is a class
EG:class myexception(NumberLimitException) extends Exception=>extends Exception->without this it is a normal cls otherwise its a userdefined exception
{
NumberLimtException(String msg)//constructor
{
super(msg);
}
}
int a=10;//0 to 100
if(condition)
throw new NumberLimitException("Invalid Input");
*/
public class intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
