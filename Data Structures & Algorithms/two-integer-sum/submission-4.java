class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> needed=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int left=target-nums[i];
            if(needed.containsKey(nums[i])){
                return new int[]{needed.get(nums[i]),i};
            }
            else{
                needed.put(left,i);
            }
        }
        return new int[]{0,0};
    }
}
