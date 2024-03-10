public class Linkedlist {
    node head;
    Linkedlist(){
        head=null;
    }
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    public void addAtBeg(int val){
        node a = new node(val);
        if(head==null){
             head=a;
        }
        else{
            a.next=head;
            head=a;
        }
    }
    public void addAtPos(int pos,int val){
        node a = new node(val);
        if(pos==0){
            addAtBeg(val);
        }
        else{
            node temp = head;
            for(int i=1;i<pos;i++){
                 temp=temp.next;
            }
            a.next=temp.next;
            temp.next=a;

        }
    }
    public void deleteAtbeg(){
        head=null;
    }
    public void deleteAtPos(int index){
        if(index==0){
            deleteAtbeg();
        }
        else{
            node temp = head;
            node prev = null;
            for(int i=0;i<index;i++){
                 prev=temp;
                 temp=temp.next;
            }
            prev.next=temp.next;
        }
    }
    public void reverse(){
        node  prev=null;
        node current=head;
        node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void display(){
        node temp = head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public boolean iscycle(node a){
        node slow = head;
        node  fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public node atpointOfCycle(node a){
        node slow=head;
        node  fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public void removecycle(node a){
        node slow=head;
        node fast=head;
        node prev=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
            }
        }
    }
}
