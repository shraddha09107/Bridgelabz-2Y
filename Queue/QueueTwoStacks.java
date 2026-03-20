import java.util.Stack;
public class QueueTwoStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack1.empty() && stack2.empty()) {
            System.out.println("empty");
            return -1;
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

    public static void main(String[] args) {
        QueueTwoStacks queue = new QueueTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
