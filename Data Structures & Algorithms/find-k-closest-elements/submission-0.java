class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int first=Math.abs(a-x);
            int second=Math.abs(b-x);

            if(first==second)return b-a;
            else return second-first;
        });

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k)pq.remove();
        }

        List<Integer> list=new ArrayList<>();
        int size=pq.size();

        for(int i=0;i<size;i++){
            list.add(pq.remove());
        }
        Collections.sort(list);
        return list;
    }
}