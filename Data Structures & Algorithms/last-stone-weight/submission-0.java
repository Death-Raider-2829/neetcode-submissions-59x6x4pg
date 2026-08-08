class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.add(stone);
        }

        while(pq.size()>1){
            int x=0;
            
            if(!pq.isEmpty()){
                x=pq.peek();
                pq.remove();
            }
            int y=0;
            if(!pq.isEmpty()){
                y=pq.peek();
                pq.remove();
            }

            if(x==y)continue;
            else{
                pq.add(Math.abs(x-y));
            }
        }

        if(pq.isEmpty())return 0;
        return pq.peek();
    }
}
