package Stack;

import java.util.Stack;

public class SortStackInAscending {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertSorted(stack, top);
    }
    public static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value >=stack.peek()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
}
