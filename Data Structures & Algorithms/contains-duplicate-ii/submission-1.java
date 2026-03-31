class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        int right=k;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(nums[i])==true){
                return true;
            }
            map.put(nums[i],i);
        }

        while(right<nums.length){
            if(map.containsKey(nums[right])){
                return true;
            }
            else{
                map.remove(nums[left]);
                left++;
                map.put(nums[right],right);
                right++;
            }
        }
        return false;
        
    }
}