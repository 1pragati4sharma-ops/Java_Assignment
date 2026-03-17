package Java_Assignment4.Module10;

// LeetCode 876 – Middle of the Linked List
public class MiddleLL {

    static Node middleNode(Node head){
        Node slow=head, fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);

        System.out.println(middleNode(a).data);
    }
}
