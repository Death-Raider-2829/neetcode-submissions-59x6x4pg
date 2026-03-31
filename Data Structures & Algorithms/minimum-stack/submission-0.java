class MinStack {
    Stack<Integer> st;
    public MinStack() {
        this.st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min=st.peek();
        Stack<Integer> s1=new Stack<>();
        while(!st.isEmpty()){
            if(st.peek()<min){
                min=st.peek();
            }
            s1.push(st.pop());
        }

        while(!s1.isEmpty()){
            st.push(s1.pop());
        }
        return min;
    }
}
