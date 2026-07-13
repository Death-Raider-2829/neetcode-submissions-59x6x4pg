class StockSpanner {
    List<Integer> price;
    Stack<Integer> current_max;
    Stack<Integer> index;

    public StockSpanner() {
        price=new ArrayList<>();
        current_max=new Stack<>();
        index=new Stack<>();
    }
    
    public int next(int x) {
        price.add(x);

        while(!current_max.isEmpty() && current_max.peek()<=x){
            current_max.pop();
            index.pop();
        }
        int max=1;
        if(current_max.isEmpty()){
            max=price.size();
        }
        else{
            int ind=index.peek();
            int curr=price.size();
            max=curr-ind;
        }
        index.push(price.size());
        current_max.push(x);
        return max;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */