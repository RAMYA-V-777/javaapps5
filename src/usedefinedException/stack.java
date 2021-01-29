/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usedefinedException;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws stackexception{
        // TODO code application logic here
        //implement all stack operations and an exception
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int max=s.nextInt();
        stack1 obj=new stack1(max);
        int choice,i;
        char ch;
        do
        {
            System.out.println("1.Push\n2.Pop\n3.Display");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    if(!obj.isfull())
                {
                     System.out.println("Enter the element to be inserted:");
                     i=s.nextInt();
                     obj.push(i);
                }
                else
                    try
                    {
                        throw new stackexception("Stack is full");
                    }
                catch(stackexception e)
                {
                     System.out.println(e);
                }
                break;
                case 2:
                    if(!obj.isempty())
                {
                     System.out.println("Deleted Element"+obj.pop());
                }
                else
                  try
                    {
                        throw new stackexception("Stack is empty");
                    }
                catch(stackexception e)
                {
                     System.out.println(e);
                }
                break;
                case 3:
                    obj.display();
                    break;
                default:
                     System.out.println("Enter option from 1 to 3:");
                    break;
            }
             System.out.println("Do you want to continue:");
             ch=s.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        }
        
    }
    

class stack1//LIFO
{
    int top=-1;
    int a[];
    int max;
    stack1(int n)
    {
        max=n;
        a=new int[max];
    }
    void push(int i)
    {
        a[++top]=i;
    }
    int pop()
    {
        return a[top--];
    }
    boolean isfull()
    {
        return top==max-1;
    }
    boolean isempty()
    {
        return top==-1;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
    

class stackexception extends Exception
{
    String msg;
    stackexception(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
