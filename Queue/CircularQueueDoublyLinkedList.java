public class CircularQueueDoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public class Circularqueue(){
        Node front;
        Node rear;
        void enqueue(int x){
            Node newNode=new Node(x);
            if(front == null){
                front=rear=newNode;
                rear.next=front;
                rear.prev=front;
                return;
            }
        }
    }

}
