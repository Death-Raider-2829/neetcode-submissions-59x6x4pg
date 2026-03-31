class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(map.containsKey(remaining)){
                arr[0]=map.get(remaining);
                arr[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
