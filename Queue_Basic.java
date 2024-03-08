package Queue_Apna_College;

import java.lang.reflect.Array;
import java.util.*;

class Node {

    int data;
    Node next;
  
    Node(int data) {
        this.data = data;
        this.next = null;
    }

}


public class Queue_Basic {

    static class queueArray{
        static int arr[];
        static  int size ;
        static int index;
        queueArray(int n ){

            arr = new int[n];
            this.index = -1;
        }

        
        //Queue add  time - 0(1)
        public static void add(int data){
            if(index==arr.length-1){
                System.out.println("Queue Overflow");
                return;
            }
            index++;
            arr[index] = data;
            
        }
        //Queue remove- time -0(n)
        public static void remove(){
            if(index==-1){
                System.out.println("Queue Underflow");
                return;
            }
            for(int i=0;i<index;i++){
                arr[i] = arr[i+1]; //shift element to front 
            }
            index --;
        }
        //print element 
        public static void print(){
            for(int i=0;i<=index;i++){
                if(arr[i]==-1){
                    continue;
                }
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    static class queueLL{
        static Node head = null;
        static Node tail = null;
        
         //is empty 
         public static boolean isEmpty(){
            return head ==null;
        }
        //add time - 0(1)
        public static void add(int data){
            Node new_node = new Node(data);
            if(head==null){
                head = new_node;
                tail = head;
            }
            else{
                tail.next = new_node;
                tail = new_node; 
            }
        }

        //remove time - 0(1)
        public static int  remove(){
            if(head==null){
                System.out.println("Queue is underflow");
                return -1;
            }
            int t = head.data;
            if(tail==head){
                tail = head = null;
                return t;
            }
            head = head.next;
            return t;
        }

        
    }
    
    public static void main(String[] args) {
       queueLL q  = new queueLL();
       q.add(1);
    //    q.add(2);
    //    q.add(3);
    //    q.add(4);
    //    q.add(5);
       while(!q.isEmpty()){
        System.out.println(q.remove());
       }
    }   
}
