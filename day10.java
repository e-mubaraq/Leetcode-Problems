class MinStack {

    Stack<Integer> stacks, minStack;
    
    /** initialize your data structure here. */
    public MinStack() {
        stacks = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        stacks.push(x);
        if(minStack.empty())
            minStack.push(x);
        else
            minStack.push(Math.min(minStack.peek(), x)); 
    }
    
    public void pop() {
        if (!stacks.empty())
            stacks.pop();
        if (!minStack.empty())
            minStack.pop();
    }
    
    public int top() {
        if (!stacks.empty())
            return stacks.peek();
        return -1;
    }
    
    public int getMin() {
        if (!minStack.empty())
            return minStack.peek();
        return -1;
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
