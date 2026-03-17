package Java_Assignment4.Module10;

// LeetCode 141 – Linked List Cycle
public class LLCycle {

    static boolean hasCycle(Node head){
        Node slow=head, fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) return true;
        }

        return false;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=a;

        System.out.println(hasCycle(a));
    }
}
