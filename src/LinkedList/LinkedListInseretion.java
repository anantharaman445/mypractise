package LinkedList;
import java.io.*;
import java.util.*;
public class LinkedListInseretion {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int p){
            data = p;
            next = null;
        }
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
       head = newNode;

    }

    public void inserAfter(Node prevNode, int data){
        if (prevNode == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        if (head == null)
        {
            head = new Node(data);
            return;
        }
        newNode.next = null;
       Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        return;

    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public void deleteNode(int data){
        Node temp = head, prev=null;
        if(temp != null && temp.data == data){
        head = temp.next;
        return;
        }
        if(temp == null)
            return;

        while (temp != null && temp.data != data)
        {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }
    void deleteList()
    {
        head = null;
    }

    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] abcd){
        LinkedListInseretion listInseretion = new LinkedListInseretion();

        listInseretion.insertLast(6);
        listInseretion.push(7);
        listInseretion.push(1);
        listInseretion.push(9);
        listInseretion.insertLast(4);
        listInseretion.inserAfter(listInseretion.head, 8);
//        listInseretion.deleteNode(7);
//        listInseretion.deleteList();
       System.out.println("Count is " +listInseretion.getCount());
        listInseretion.printList();
    }


    ////https://www.geeksforgeeks.org/doubly-linked-list/ ////todo double link list
    ////https://www.geeksforgeeks.org/circular-linked-list-set-2-traversal/
}
