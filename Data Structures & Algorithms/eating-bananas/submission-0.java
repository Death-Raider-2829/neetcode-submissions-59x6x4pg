class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // DONT ADD ANY CHECKS
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        // A simple number line will do
        // int[] arr=new int[max];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=i+1;
        // }

        int left=1;
        int right=max;
        int min=Integer.MAX_VALUE;
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                int hours=(piles[i]+mid-1)/mid;
                time+=hours;
            }

            if(time<=h){
                // Unnecessary check. When a smaller time is found then the binary search
                // already shifts to a smaller number
                // if(min>time){
                //     min=time;
                //     res=arr[mid];
                //     right=mid-1;
                // }

                min=time;
                res=mid;
                // Searches in a smaller area
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}
