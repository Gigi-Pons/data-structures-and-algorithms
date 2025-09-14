/*
 * This class implements a custom MinStack that supports standard stack operations 
 * (push, pop, top) plus a getMin() function that returns the minimum value, all in constant time (O(1)). 
 * It uses two stacks: one to store all values, and a second to keep track of the current minimums. 
 * Every time you push or pop, the minStack updates to make sure the smallest value is always on top.
 */

class MinStack {
    //globally declaring the stacks
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    //constructor creates both the stacks.
    //One stack will hold all incoming values
    //The other stack will hold only values less than the previous one, this 
    //is how we will achieve O(1), by constantly having the minimum value at the 
    //top of the minStack
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        //val is the value that should be pushed to the stack
        stack.push(val);
        //we must compare the previous minimum value in the minStack before pushing it.
        //Check if the minStack is empty, if not then compare the values to push the smallest.
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        //check if stack is empty, if so there is nothing to return
        if (stack.isEmpty()) {
            return;
        }

        //if not empty, then assign that value to 'top' variable before popping it.
        //check if top variable is the same as the minimum value in the minStack, if so,
        //then also pop from the minStack
        int top = stack.pop();
        if (minStack.peek() == top) {
            minStack.pop();
        }
        
    }
    
    //get the top value of the stack
    public int top() {
       return stack.peek();
        
    }
    
    //get the top value of the minStack
    public int getMin() {
        return minStack.peek();
        
    }
}
