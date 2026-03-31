class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapped=new HashMap<>();
        int[] arr=new int[2];
        // Loop around the array
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(mapped.containsKey(nums[i])){
                arr[0]=mapped.get(nums[i]);
                arr[1]=i;
                break;
            }
            mapped.put(remaining,i);
        }
        return arr;
    }
}
