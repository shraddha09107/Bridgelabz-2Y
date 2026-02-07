public class Node {
    //create node and make a list of 5 nodes
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;





                int temp=n3.data;
                n3.data=n2.data;
                n2.data=n4.data;
                n4.data=temp;


               Node head =n1;


        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;


}

    }
}
