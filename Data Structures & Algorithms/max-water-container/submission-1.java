class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxSize=0;
        while(left<right){
            int distance=(right-left);
            int size=distance*(int)Math.min(heights[left],heights[right]);
            if(maxSize<size){
                maxSize=size;
            }

            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }

        return maxSize;
    }
}
