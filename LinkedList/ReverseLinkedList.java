package SelfPractice.LinkedList;

class Node2{
    Node2 link;
    int data;
    Node2(int data){
        this.data= data;
        this.link=null;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node2 head = new Node2(10);
        head.link = new Node2(20);
        head.link.link = new Node2(30);
        head.link.link.link = new Node2(40);
        head.link.link.link.link = new Node2(50);

        reverseLinkedList(head);
    }

    private static void reverseLinkedList(Node2 head) {

        Node2 cur = head;
        Node2 prev = null , next = null;

        while (cur != null){

            next=cur.link;
            cur.link=prev;
            prev = cur;
            cur=next;
        }

        while (prev !=null){
            System.out.println(prev.data);
            prev=prev.link;
        }


    }

}
