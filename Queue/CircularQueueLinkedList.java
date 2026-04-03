public class CircularQueueLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public class Circularqueue{
        Node front;
        Node rear;
        void enqueue(int x){
            Node newNode=new Node(x);
            if(front==null){
                front=rear=newNode;
                rear.next=front;
                return;
            }
            rear.next=newNode;
            rear=newNode;
            rear.next=front;
        }
        void dequeue(){
            if(front==null){
                return;

            }
            if(front==rear){
                front=rear=null;
                return;
            }
            front=front.next;
            rear.next=front;
        }
        void display(){
            if(front==null){
                return;
            }
            if(front==rear){
                System.out.println(front.data);
                return;
            }
            Node temp=front;
            while(temp.next!=front){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
        public static void main(String[] args) {
            CircularQueueLinkedList cq=new CircularQueueLinkedList();
            Circularqueue queue=cq.new Circularqueue();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.display();
            queue.dequeue();
            queue.display();
        }
}
