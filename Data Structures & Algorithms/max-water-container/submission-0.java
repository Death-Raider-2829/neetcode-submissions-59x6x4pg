class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int max_size=Integer.MIN_VALUE;
        while(start<end){
            int distance=end-start;
            int current_size=0;
            
            if(heights[start]>heights[end]){
                current_size+=heights[end]*distance;
                end--;
            }

            else if(heights[start]<=heights[end]){
                current_size+=heights[start]*distance;
                start++;
            }
            
            if(max_size<current_size){
                max_size=current_size;
            }
        }
        return max_size;
    }
}
