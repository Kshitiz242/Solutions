//Linked List implementation in Java
//import java.util.*;

public class LinkedList{
    private Node head;
    public LinkedList(){    //Is a constructor
        this.head=null;     //Initializes an empty Linked List
    }
    class Node{
        int val;
        Node nextNode; 
        public Node(int data){  //Constructor that creates a Node object
            this.val=data;
            this.nextNode=null;
        }
    }
    void insert(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
        }
        else{
            Node ptr=head;
            while(ptr.nextNode!=null){
                ptr=ptr.nextNode;
            }
            ptr.nextNode=newNode;
        }
        
    }
    void show(){
        Node currNode=head;
        while(currNode.nextNode!=null){
            System.out.print(currNode.val+"->");
            currNode=currNode.nextNode;
        }
        System.out.println(currNode.val);
    
    
    }
    public static void main(String[] args){
        LinkedList List=new LinkedList();
        List.insert(0);
        List.insert(4);
        List.insert(10);
        List.show();
    }


}

