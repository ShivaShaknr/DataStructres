public class Stack {
    node top;
    Stack(){
        top=null;
    }
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    void push(int val){
        node  a = new node(val);
        a.next=top;
        top=a;
    }
    int pop(){
        node temp = top;
       top=top.next;
       return  temp.data;
    }
    int peek(){
        return top.data;
    }
}
