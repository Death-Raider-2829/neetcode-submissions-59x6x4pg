class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int distance1=a[0]*a[0]+a[1]*a[1];
            int distance2= b[0]*b[0]+b[1]*b[1];

            return Integer.compare(distance2,distance1);
        });

        for(int i=0;i<points.length;i++){
            pq.add(points[i]);

            if(pq.size()>k){
                pq.remove();
            }
        }

        int[][] ans=new int[k][points[0].length];

        for(int i=0;i<k;i++){
            ans[i][0]=pq.peek()[0];
            ans[i][1]=pq.peek()[1];
            pq.remove();
        }

        return ans;
    }
}
