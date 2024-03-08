package Queue_Apna_College;

import exercise_5.rectangle;

public class Circular_que {
    static class cirqueueArray{
        static int arr[];
        static  int size ;
        static int rear;
        static int front;
        cirqueueArray(int n ){

            arr = new int[n];
            this.rear = -1;
            this.front = -1;
            this.size = n;
        }
        
       
        //check is empty 
        public static boolean isEmpty(){
            return (rear==-1 && front==-1);
            
        }

        //check is full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //Queue add -time - 0(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Overflow");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%arr.length;
            arr[rear] = data;
            
        }

        //Queue remove - time 0(1)
        public static int  remove(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            //last element delete 
            int ans = arr[front];
            if(rear==front){
                rear = front  = -1;
            }
            else{
                front = (front+1)%arr.length;
            }
            return ans ;
        }

        

       
    }
    public static void main(String[] args) {
        cirqueueArray q = new cirqueueArray(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
       while(!q.isEmpty()){
         System.out.println(q.remove());  
       }
       
    }
}
