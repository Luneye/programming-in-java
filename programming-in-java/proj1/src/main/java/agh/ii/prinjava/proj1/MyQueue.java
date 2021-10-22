package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {
    void enqueue(E x);//adds an element on the top position of the queue

    E dequeue();//deletes the last element of the queue

    default boolean isEmpty() {
        return numOfElems() == 0;//returns true if numofElems() returns 0, which means if there is
                                 //no element in the queue
    }

    int numOfElems();//gets the number of elements in the queue

    E peek();//returns the front of the queue

    String DisplayQueue();//extra method added to display the whole queue
    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
