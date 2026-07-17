class MyQueue {
    Stack<Integer> main;
    Stack<Integer> dummy;
    public MyQueue() {
        main=new Stack<>();
        dummy=new Stack<>();
    }
    
    public void push(int x) {
        while(!main.isEmpty()){
            dummy.push(main.pop());
        }
        dummy.push(x);

        while(!dummy.isEmpty()){
            main.push(dummy.pop());
        }
    }
    
    public int pop() {
        int x=main.pop();
        return x;
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */