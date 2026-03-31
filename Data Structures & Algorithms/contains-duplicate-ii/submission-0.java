class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        int right=k;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.containsValue(nums[i])==true){
                return true;
            }
            map.put(i,nums[i]);
        }

        while(right<nums.length){
            if(map.containsValue(nums[right])){
                return true;
            }
            else{
                map.remove(left);
                left++;
                map.put(right,nums[right]);
                right++;
            }
        }
        return false;
        
    }
}