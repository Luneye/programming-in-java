package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        //Should display 3,2,1
        System.out.println(dLinkList.toString());
    }

    @Test
    void addLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //Should display 1,2,3
        System.out.println(dLinkList.toString());
    }

    @Test
    void removeFirst() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //List contains 1,2,3
        dLinkList.removeFirst();
        //Should now display 2,3
        System.out.println(dLinkList.toString());
    }

    @Test
    void removeLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //List contains 1,2,3
        dLinkList.removeLast();
        //Should now display 1,2
        System.out.println(dLinkList.toString());
    }

    @Test
    void testToString() {
        //Should display 'null' as the list is empty
        System.out.println(dLinkList.toString());
        //We add 1 to the List
        dLinkList.addLast(1);
        //Should now display '1->null'
        System.out.println(dLinkList.toString());
    }

    @Test
    void toStringRev() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //List contains 1,2,3
        //Should now display the list in reverse order (3,2,1,null)
        System.out.println(dLinkList.toStringRev());
    }

    @Test
    void getTop() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //List contains 1,2,3
        //Should now display the top of the list (1)
        System.out.println(dLinkList.getTop());
    }

    @Test
    void getLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        //List contains 1,2,3
        //Should now display the last element of the list (3)
        System.out.println(dLinkList.getLast());
    }
}