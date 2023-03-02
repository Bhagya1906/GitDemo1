// Queue using java 

import java.util.*;

class Queue{
    private static int front,rear,size;
    private static int q[];
    
    Queue(int s)
    {
        front=rear=0;
        size=s;
        q = new int[size];
    }

static void enqueue(int item)
{
    if(rear==size)
    {
        System.out.println("Queue is full");
        return;
    }
    else{
        q[rear]=item;
        rear++;
    }
    
    return;
}

static void dequeue()
{
    if(front==rear)
    {
        System.out.println("Queue is Empty");
        return;
    }
    else{
        
        for(int i=0;i<rear-1;i++)
        {
            q[i]=q[i+1];
        }
        
        if(rear<size)
        {
            q[rear]=0;
            rear--;
        }
        
        return;
    }
}

static void display()
{
    for(int i=front;i<rear;i++)
    {
        System.out.println(q[i]+ " ");
    }
    return;
}

static void queueFront()
{
    if(front==rear)
    {
        System.out.println("Queue is Empty");
        return;
    }
    System.out.println(q[front]);
    return;
}
}

public class Main
{
    public static void main(String[] args)
    {
        Queue q = new Queue(5);
        
        q.enqueue(1);
        q.display();
        q.queueFront();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
    }
}
