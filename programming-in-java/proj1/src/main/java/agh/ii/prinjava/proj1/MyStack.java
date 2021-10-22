package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {
    E pop();//adds an element on the top position of the stack

    void push(E x);//removes the element on the first position (top) of the stack

    default boolean isEmpty() {
        return numOfElems() == 0;//returns true if numofElems() returns 0, which means if there is
                                 //no element in the stack
    }

    int numOfElems();//gets the number of elements in the stack

    E peek();//returns the top of the stack

    String DisplayStack();//extra method added to display the whole stack

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
