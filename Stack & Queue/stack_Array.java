//Implementing stack using Array
/*
Basic Operations of Stack 
Push ()-Push the element inside
PoP() -deletes the current element
======================================
Stack follows FIFO - First in First out , basically think of pile of books ,
you are only allowed to take the book at top also states as currentbook
you cannot access the book below it and soon.
This is how stack memory is one sided filling and deleting.
*/
/**
 * stack_Array
 */
import java.lang.reflect.Method;
import java.util.*;
public class stack_Array {
    static int ptr=-1;//stack pointer

    public static void push(int arr[],int n) {
        if(ptr==arr.length-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            arr[++ptr]=n;
            System.out.println("Element entered in stack is : - "+n);
        }
        
    }
    public static void pop(int arr[]) {
        if(ptr==-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            System.out.println("Element popped out is > "+arr[ptr--]);
        }
        
    }
    public static void display(int arr[]) {
        if(ptr!=-1)
        {
            for(int i=0;i<=ptr;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Stack Empty");
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Stack size > ");
        int n =in.nextInt();
        int arr[] = new int[n];
        push(arr,5);
        push(arr,7);
        push(arr,12);
        push(arr,9);
        push(arr,10);
        pop(arr);
        display(arr);

    }
}