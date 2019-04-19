package LinkedList;
import java.io.*;
import java.util.*;
public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
     void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
     }

     void insertAfter(Node prevNode, int data){
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        if(newNode.next!= null)
            newNode.next.prev = newNode;

     }

     void append(int data){
         Node newNode = new Node(data);
         Node last = head;
         newNode.next = null;
         if(head == null){
             newNode.prev = null;
             head = newNode;
             return;
         }
         while (last.next != null)
             last = last.next;

         newNode.prev = last;
         last.next = newNode;
     }
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
//        System.out.println("Traversal in reverse direction");
//        while (last != null) {
//            System.out.print(last.data + " ");
//            last = last.prev;
//        }
    }

    public DoublyLinkedList mergeLinkedlist(DoublyLinkedList dll1, DoublyLinkedList dll2, DoublyLinkedList dll3 ){

        Node dll3Node = null;
        while(dll2.head!=null) {
            dll3Node = dll1.head;
            dll3.push(dll3Node.data);
            dll1.head = dll2.head;
            dll2.head = dll3Node.next;
        }
        return dll3;




    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        DoublyLinkedList dll2 = new DoublyLinkedList();
        DoublyLinkedList dll3 = new DoublyLinkedList();

        dll.push(6);

        dll.push(7);

        dll.push(1);

        dll.push(4);
//        dll.insertAfter(dll.head.next, 8);
        dll.printlist(dll.head);



        System.out.println("DLL2 is: ");

        dll2.push(8);
        dll2.push(9);
        dll2.push(10);
        dll2.push(11);
        dll.printlist(dll2.head);

        System.out.println("Merged Linked List: ");
        dll3.mergeLinkedlist(dll,dll2,dll3);

        dll.printlist(dll3.head);

    }

}
