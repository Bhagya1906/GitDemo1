// stack using java 

import java.util.Stack;
import java.util.Iterator;

public class Main{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        
        //pushing elements in to stack
        for(int i=1;i<=5;i++)
        {
            s.push(i);
        }
        
        //Displaying elements after pushing
        System.out.println(s);
        
        //poping the element from stack
        s.pop();
        System.out.println(s);
        
        //viewing the top of stack
        System.out.println(s.peek());
        
        //checking whether the stack is empty or not
        System.out.println(s.isEmpty());
        
        //searching the element and printing the index
        int ele = s.search(2);
        System.out.println(ele);
        
        //find the size of stack
        System.out.println(s.size());
        
        
        
        
/*We use the iterator method to get an iterator for the elements of the stack.
Then, we print the elements of the iterator using the while loop. 
We use the hasNext method of the iterator object to check if the iterator
contains more elements, then use the next method to get the next 
available element in the iterator.*/
        
        Iterator obj = s.iterator();
        while(obj.hasNext())
        {
            System.out.print(obj.next()+" ");
        }
       
    }
}

