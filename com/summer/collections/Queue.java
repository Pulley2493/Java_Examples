package com.summer.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String args[]){
        final java.util.Queue queue = new PriorityQueue<Integer>((a,b)->(b-a)); // Max heap for min heap => a-b

        queue.add(20);
        queue.add(23);
        queue.add(21);

        queue.add(2323232);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.printf("Size of queue %s top element of Queue %s \n",queue.size(),queue.peek());
        System.out.println(queue);

        var iteratorQ = queue.iterator();
        while (iteratorQ.hasNext())System.out.println(iteratorQ.next());


        final Deque deQueue = new LinkedList();
        deQueue.add(10);
        deQueue.add(11);
        deQueue.addFirst(12);
        deQueue.addLast(13);
        deQueue.add(0);
        System.out.printf("Queue First element %s and Last element %s \n",deQueue.peekFirst(),deQueue.peekLast());
        deQueue.removeFirst();
        deQueue.removeLast();
        System.out.println(deQueue);

        var iteratorDQ = deQueue.iterator();
        while (iteratorDQ.hasNext())System.out.println(iteratorDQ.next());
    }
}
