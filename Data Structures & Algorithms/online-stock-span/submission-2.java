class StockSpanner {
    List<Integer> list;
    Stack<Integer> num;
    Stack<Integer> index;

    public StockSpanner() {
        index=new Stack<>();
        num=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int i=list.size()-2;
        while(i>=0 && list.get(i)<=price){
            i--;
        }
        if(i==-1) return list.size();
        return list.size()-i-1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */