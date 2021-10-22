package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems=new DLinkList<>();//elems = our stack
    int nb_elems=0;//variable to count the number of elements in our stack

    //Let's explain a bit how we will simulate a stack thanks to the methods from our linked list
    //A stack adds elements (push) and deletes (pop) elements at the top position
    //The last added elements in a stack are the first to be removed
    //Thus, we will use a linked list that we will browse using the next ref to simulate our stack
    //The top will be the last element position of this list
    //The pop will be performed by adding elements on the last position of this list
    //The push will be performed by deleting elements on the last position of this list
    @Override
    public E pop() {//method to pop elements
        if(!isEmpty()){//if we call this method multiple times even if the list is empty,
                       //the number of elements will keep being equal to 0. Else, if the list is
                       //not empty, we subtract 1 to nb_elems as an element was deleted
            nb_elems=nb_elems-1;
        }
        return elems.removeLast();//we remove the element on the last position of the list
    }

    @Override
    public void push(E x) {//method to push data
        nb_elems=nb_elems+1;//we add 1 to nb_elems as a new element is added
        elems.addLast(x);//we add the data on the last position of our list elems
    }

    @Override
    public int numOfElems() {//method to return the number of elements in the stack
        return nb_elems;//return the variable that we used to count the number of elements in the stack
    }

    @Override
    public E peek() {//method to return the data in the top position in the stack
        return elems.getLast();//returns the data in the last position of the linked list
    }

    @Override
    public String DisplayStack(){//method to display the elements in the stack as a string
       return elems.toString();//returns a string of the elements in the linked list
                               //by browsing the list from the first position using next ref
    }
}
