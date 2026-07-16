class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
        
    }
    
    public void push(int val) {
        int x=val;
        if(!st.isEmpty()){
            x=min.peek();
        }

        int mi=Math.min(val,x);
        min.push(mi);
        st.push(val);
    }
    
    public void pop() {
        int x=st.pop();
        min.pop();
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
