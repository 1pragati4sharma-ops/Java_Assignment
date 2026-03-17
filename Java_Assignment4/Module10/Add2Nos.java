package Java_Assignment4.Module10;
// LeetCode 2 – Add Two Numbers
public class Add2Nos {

    static Node add(Node l1,Node l2){
        Node dummy=new Node(0);
        Node cur=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;

            if(l1!=null){sum+=l1.data;l1=l1.next;}
            if(l2!=null){sum+=l2.data;l2=l2.next;}

            carry=sum/10;

            cur.next=new Node(sum%10);
            cur=cur.next;
        }

        return dummy.next;
    }

    public static void main(String[] args){}
}
