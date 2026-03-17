package Java_Assignment4.Module10;
 // LeetCode 19 – Remove Nth Node From End
public class NthNode {

    static Node removeNth(Node head,int n){
        Node dummy=new Node(0);
        dummy.next=head;

        Node fast=dummy, slow=dummy;

        for(int i=0;i<=n;i++)
            fast=fast.next;

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);

        removeNth(a,2);
    }
}
