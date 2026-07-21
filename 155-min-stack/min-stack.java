class MinStack {
    Stack<Integer> stack;
    Stack<Integer> copiedStack;
    public MinStack() {
     stack = new Stack<>();
     copiedStack = new Stack<>();
    }
    
    public void push(int value) {
       if(copiedStack.isEmpty()){
        copiedStack.push(value);
       }
       else{
       int stackelem = copiedStack.peek();
       int min = Math.min(stackelem,value);
       copiedStack.push(min);
       }
       stack.push(value);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
          stack.pop();
          copiedStack.pop();
        }
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
      return copiedStack.peek();  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */