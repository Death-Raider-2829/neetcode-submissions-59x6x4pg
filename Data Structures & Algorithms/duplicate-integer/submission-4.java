class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> result=new HashSet<>();
        for(int number:nums){
            if(result.add(number)==false){
                return true;
            }
        }
        return false;
    }
}