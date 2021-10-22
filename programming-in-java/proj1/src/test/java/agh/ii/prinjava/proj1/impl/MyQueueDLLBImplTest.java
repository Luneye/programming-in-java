package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        //Queue contains 1,2,3
        //Should now display 1,2,3
        System.out.println(queueOfInts.DisplayQueue());
    }

    @Test
    void dequeue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        //Queue contains 1,2,3
        //Should now display 1,2,3
        System.out.println(queueOfInts.DisplayQueue());
        //Dequeue and so we should now only have 1,2
        queueOfInts.dequeue();
        System.out.println(queueOfInts.DisplayQueue());
        //Let's dequeue again
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        //Every elements are deleted. So should display null
        System.out.println(queueOfInts.DisplayQueue());
        //If we dequeue another time, nothing will be deleted as the queue is empty
        queueOfInts.dequeue();
        //So should display null again
        System.out.println(queueOfInts.DisplayQueue());
    }

    @Test
    void numOfElems() {
        //Adds 3 elements
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        //Should display 3
        System.out.println(queueOfInts.numOfElems());
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        queueOfInts.dequeue();//extra line to show that it won't delete anything as there is no element in the queue
        //Should display 0 as we deleted our 3 elements
        System.out.println(queueOfInts.numOfElems());
    }

    @Test
    void peek() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        //Queue contains 1,2,3
        //Should display the top of the queue (3)
        System.out.println(queueOfInts.peek());
    }

    @Test
    void displayQueue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        //Queue contains 1,2,3
        //Should display '1->2->3->null'
        System.out.println(queueOfInts.DisplayQueue());
    }
}