class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complementStore=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(complementStore.containsKey(complement)){
                arr[0]=complementStore.get(complement);
                arr[1]=i;
                break;
            }
            complementStore.put(nums[i],i);
        }
        return arr;
    }
}
