class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result=new HashMap<>();
        int[] arr=new int[2];

        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            // We could either store nums[i] and indices...essentially checking if any nums[i] stored in map is equal to remaining....or we could store remaining for each element in map and check if the current element of nums[i] is equal to any value in map.
            // Here we are applying check on remaining means we store nums[i] and indices in map.
            if(result.containsKey(remaining)){
                arr[0]=result.get(remaining);
                arr[1]=i;
                break;
            }
            // We store nums[i] as indices as key and i as value
            result.put(nums[i],i);
        }
        return arr;
    }
}
