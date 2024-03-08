package Queue_Apna_College;

import java.util.*;

import Link_List_Apna_College.ll_basic;

public class Queue_using_stack {

    //Queue Using Two Stack

    //Approach -1 ***

    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // //add - 0(n)
    // public static void addtwoStack(int data){
    //     if(s1.isEmpty()){
    //         s1.push(data);
    //         return;
    //     }
    //     while(!s1.isEmpty()){
    //         s2.push(s1.pop());
    //     }

    //     s1.push(data);
    //     while(!s2.isEmpty()){
    //         s1.push(s2.pop());
    //     }
        
    // }

    // //remove -0(1)
    // public static int remov(){
    //     if(s1.isEmpty()){
    //         return -1;
    //     }
    //     int t = s1.pop();
    //     return t;
    // }

    
    //Approach -2 ***
    static Stack <Integer> s1 = new Stack<>();
    static Stack <Integer> s2 = new Stack<>();

    //add -0(1)
    public static void add(int data){
        s1.push(data);
    }

    //remove -0(n);
    public static int remov(){
        if(s1.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int t = s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return t;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        System.out.println(remov());
        System.out.println(remov());
        add(5);
        System.out.println(remov());

        Queue<Integer> a = new LinkedList<>();
      
    }
}
