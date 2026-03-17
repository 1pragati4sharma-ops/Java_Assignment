package Java_Assignment4.Module10;
// LeetCode 206 – Reverse Linked List
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class RevLL {

    static Node reverse(Node head){
        Node prev=null;

        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);

        Node r=reverse(a);

        while(r!=null){
            System.out.print(r.data+" ");
            r=r.next;
        }
    }
}
