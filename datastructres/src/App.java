public class App {
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.addAtBeg(10);
        list.addAtPos(1,20);
        list.addAtPos(2, 30);
        list.addAtPos(3, 40);
        list.addAtPos(4, 50);
        list.reverse();
        //list.display();
        Stack stk = new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println(stk.pop());
        
        
    }
}
