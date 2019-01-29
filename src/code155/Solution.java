package code155;


import java.util.LinkedList;
import java.util.Stack;

class MinStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {

        stack1.push(x);
        if (stack2.empty()||stack2.peek()>=x) stack2.push(x);

    }

    public void pop() {
        int x = stack1.pop();
        if (x==stack2.peek()) stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

    public static void main(String[] args) {

    }



}



