package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    Node<E> head = null;
    public void addFirst(E new_elem){//method to add an element on the first position of the list
        Node<E> temp = head;//we create temp to save the reference of head in it
        Node<E> node = new Node<>();//we initialize the new node and save the inserted data in it
        node.elem=new_elem;
        node.next = temp;//we save in node the next reference of the first node (temp)
                         //then we put the reference of the previous node to null because
                         //node will become our very first element of the list
        node.prev=null;
        if(head!=null) {//if head is not null, the reference of the previous node will be the one of
                        //the new node (node) so that we can join the two nodes
            temp.prev=node;
        }
        head = node;//the head becomes the new node
    }

    public void addLast(E new_elem){//method to add an element on the last position of the list
        Node<E> node = new Node<>();//we initialize the new node and save the inserted data in it
        node.elem=new_elem;
        Node<E> temp=head;//we create temp to save the reference of head in it
        if(head!=null) {//if head is not null, we will look for the last element of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next=node;//when we found it, we save in the next ref of temp the ref of the
                           //new node to add. Then, the next ref of node will be saved as null
                           //and the prev one will save the one of temp as it is the previous element
                           //(the old last element of the list)
        }
        else{//if head is null, we do
            // the same remaining operations than in the method addFirst()
            head = node;
        }
        node.next=null;
        node.prev = temp;

    }
    public E removeFirst(){//method to remove an element on the first position of the list
        E value=null;//we initialize the value of the element that we will return to null
                     //this is for the case if the head is null
        Node<E> temp=head;//we initialize temp which will save the reference of head
        if(temp!=null){//if head is not null, we save the value of the element to be removed in value
            value=head.elem;
            temp=temp.next;//we 'forget' the first element by saving the ref of the next one in it
            if(temp!=null) {//if temp did not become null after the previous operation, then we have
                            //to put its ref of prev to null as it will become the first node of the
                            //list and then put it as the head
                temp.prev = null;
            }
            head=temp;
        }
        return value;//we return the value of the removed element. value is null if nothing was removed
    }
    public E removeLast(){//method to remove an element on the last position of the list (before the null ref)
        Node<E> temp=head;//we create a temp to browse the list starting from the head
        E value=null;//we initialize the value that of the element to be removed to null
        Node<E> prev=temp;//forced to initialize prev=temp to avoid compilation errors here
        if(head!=null){//if head not null, we identify the case if there is 1 element and the one
                       //if there are more
            value=temp.elem;//we save first the value to delete
            if(temp.next==null){//if there is one element in the list, then head becomes null
                head=null;
            }
            else{//else, we browse the list until we reach the last element. We save at the same time
                 //the reference of the previous element before the last one in prev.
                while(temp.next!=null){
                    prev=temp;
                    temp=temp.next;
                }
                prev.next=null;//to remove the last element, we just have to say that the element just
                               //before must take null for its next ref so that we won't be able to
                               //have access to this last element
            }
        }
        return value;//we return the value of the removed element. value is null if nothing was removed
    }
    public String toString() {//method to return a string containing all the elements of our list in order
        String list;//we initialize the string containing all the elements of our list
        if(head!=null) {//if head is not null, we browse the whole list
            list = "";//list is first an empty character so that we can concatenate later
            Node<E> temp = head;//a temp saving the ref of head
            String s;//s will be the converted value in string of the data element that we are looking
                     //at in the list
            while (temp.next != null) {//we browse the list
                s = String.valueOf(temp.elem);//we convert the element to a string in s
                list = list + s + "->";//we add it to the string list
                temp = temp.next;
            }
            s = String.valueOf(temp.elem);//we need to add the last element in the string list
            list = list + s + "->null";
        }
        else{
            list="null";//if head is null, then we simply return the string "null"
        }
        return list;//we return our string
    }
    public String toStringRev(){//method to return a string containing all the elements of our list in reverse order
        String list;//we initialize the string containing all the elements of our list
        if(head!=null) {//if head is not null, we browse the whole list
            list = "";//list is first an empty character so that we can concatenate later
            Node<E> temp = head;//a temp saving the ref of head
            String s;//s will be the converted value in string of the data element that we are looking
                     //at in the list
            while (temp.next != null) {//we first browse the list until we reach the last element
                temp = temp.next;
            }
            while (temp.prev != null) {//then we browse it going through the previous references until
                                       //we reach the first element of it
                s = String.valueOf(temp.elem);//we convert the element we are looking at into a string
                list = list + s + "->";//we add it to the string list
                temp = temp.prev;
            }
            s = String.valueOf(temp.elem);//we need to add the last element in the string list
            list = list + s + "->null";
        }
        else{
            list="null";//if head is null, then we simply return the string "null"
        }
        return list;//we return our string
    }

    private static class Node<T> {//our Node class constructor
        T elem;//T is a generic type so that we can insert any types of objects in our list
        Node<T> next;
        Node<T> prev;

    }
    public E getTop(){//method to get the data from the first element in the list
        E value=null;//if head is null, we save null in this value
        if(head!=null){//else, we save the data from the head in value
            value=head.elem;
        }
        return value;//returns our value
    }

    public E getLast(){//method to get the data from the last element in the list
        E value=null;//if head is null, we save null in this value
        Node<E> temp=head;//we make a temp to browse the list starting from the head
        if(head!=null){//if head not null, we browse the list until the last element
            while(temp.next!=null){
                temp=temp.next;
            }
            value=temp.elem;//we save the data from the last element in value
        }
        return value;//returns our value
    }
}
