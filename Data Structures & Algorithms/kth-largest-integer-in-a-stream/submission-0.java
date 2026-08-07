class KthLargest {
    int nums[];
    int k;
    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=new int[nums.length];
        pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            this.nums[i]=nums[i];
            pq.add(nums[i]);
            if(pq.size()>k)pq.remove();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.remove();
        }
        return pq.peek();
    }
}
