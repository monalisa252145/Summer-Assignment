package Day5;
 import java.util.Stack;

class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element to back of queue
    public void push(int x) {
        inputStack.push(x);
    }

    // Removes element from front of queue
    public int pop() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    // Get front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
    

