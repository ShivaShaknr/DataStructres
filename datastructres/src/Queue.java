public class Queue {
    node rear;
    node front;
    Queue(){
        rear=null;
        front=null;
    }
    class node{
        int d;
        node next;
        node(int val){
            d=val;
            next=null;
        }
    }
    void enqueue(int val){
        node a = new node(val);
        if(rear==null){
            rear=a;
            front=a;
        }
        else{
            rear.next=a;
            rear=a;
        }
    }
    int dequeue(){
       node temp=front;
       front=front.next;
       return temp.d;
    }
}
