class MinStack {
    ArrayList<Integer> list;
    ArrayList<Integer> sorted;
    public MinStack() {
        list=new ArrayList<>();
        sorted=new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if(sorted.isEmpty()){
            sorted.add(val);
        }
        else{
        int x=sorted.remove(sorted.size()-1);
        sorted.add(x);
        if(val<x){
            sorted.add(val);
        }
        else{
            sorted.add(x);
        }
        }
    }
    
    public void pop() {
        list.remove(list.size()-1);
        sorted.remove(sorted.size()-1);
    }
    
    public int top() {
        int x=list.remove(list.size()-1);
        list.add(x);
        return x;
    }
    
    public int getMin() {
        int x=sorted.remove(sorted.size()-1);
        sorted.add(x);
        return x;
    }
}
