package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems=new DLinkList<>();//elems = our queue
    int nb_elems=0;//variable to count the number of elements in our queue

    //Let's explain a bit how we will simulate a queue thanks to the methods from our linked list
    //a queue adds elements (enqueue) and deletes (dequeue) elements
    //respectively from the 'front' position and the 'end' position
    //the top position in the queue is also considered as the position of the very first element
    //that can be removed
    //Thus, we will use a linked list that we will browse using the prev ref to simulate our queue
    //The top will be the first element position of this list
    //The enqueue will be performed by adding elements on the first position of this list
    //The dequeue will be performed by deleting elements on the first position of this list
    @Override
    public void enqueue(E x) {//method to enqueue data
        elems.addFirst(x);//we add the data on the first position of our list elems
        nb_elems=nb_elems+1;//we add 1 to nb_elems as a new element is added
    }

    @Override
    public E dequeue() {//method to dequeue data
        if(!isEmpty()){//if we call this method multiple times even if the list is empty,
                       //the number of elements will keep being equal to 0. Else, if the list is
                       //not empty, we subtract 1 to nb_elems as an element was deleted
            nb_elems=nb_elems-1;
        }
        return elems.removeFirst();//we remove the element on the first position of the list
    }

    @Override
    public int numOfElems() {//method to return the number of elements in the queue
        return nb_elems;//return the variable that we used to count the number of elements in the queue
    }

    @Override
    public E peek() {//method to return the data in the top position in the queue
        return elems.getTop();//returns the data in the first position of the linked list
    }

    @Override
    public String DisplayQueue(){//method to display the elements in the queue as a string
        return elems.toStringRev();//returns a string of the elements in the linked list
                                   //by browsing the list from the last position using prev ref
    }
}
