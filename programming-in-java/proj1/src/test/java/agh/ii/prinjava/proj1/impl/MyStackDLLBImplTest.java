package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        //Stack contains 1,2,3
        //Should now display 1,2,3
        System.out.println(stackOfInts.DisplayStack());
        //Pop and so we should now only have 1,2
        stackOfInts.pop();
        System.out.println(stackOfInts.DisplayStack());
        //Let's pop again
        stackOfInts.pop();
        stackOfInts.pop();
        //Every elements are deleted. So should display null
        System.out.println(stackOfInts.DisplayStack());
        //If we pop another time, nothing will be deleted as the stack is empty
        stackOfInts.pop();
        //So should display null again
        System.out.println(stackOfInts.DisplayStack());
    }

    @Test
    void push() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        //Stack contains 1,2,3
        //Should now display 1,2,3
        System.out.println(stackOfInts.DisplayStack());
    }

    @Test
    void numOfElems() {
        //Adds 3 elements
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        //Should display 3
        System.out.println(stackOfInts.numOfElems());
        stackOfInts.pop();
        stackOfInts.pop();
        stackOfInts.pop();
        stackOfInts.pop();//extra line to show that it won't delete anything as there is no element in the stack
        //Should display 0 as we deleted our 3 elements
        System.out.println(stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        //Stack contains 1,2,3
        //Should display the top of the stack (3)
        System.out.println(stackOfInts.peek());
    }

    @Test
    void displayStack() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        //Stack contains 1,2,3
        //Should display '1->2->3->null'
        System.out.println(stackOfInts.DisplayStack());
        stackOfInts.DisplayStack();
    }
}