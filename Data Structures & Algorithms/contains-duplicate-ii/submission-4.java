class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(list.size() > k){
                list.remove(list.get(0));
            }

            if(list.size() != 0 && list.contains(nums[i])){
                return true;
            }
            else{
                list.add(nums[i]);
            }
        }

        return false;
    }
}