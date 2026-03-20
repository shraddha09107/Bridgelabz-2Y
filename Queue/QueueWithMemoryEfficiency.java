public class QueueWithMemoryEfficiency {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public QueueWithMemoryEfficiency(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("full");
            return;
        }
        rear++;
        arr[rear] = item;
    }

    public int dequeue() {
        if (front == rear + 1) {
            System.out.println("empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        front++;
        return item;
    }

    public static void main(String[] args) {
        QueueWithMemoryEfficiency queue = new QueueWithMemoryEfficiency(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20
        System.out.println(queue.dequeue()); // Output: 30
        System.out.println(queue.dequeue()); // Output: Queue is empty
    }
}
