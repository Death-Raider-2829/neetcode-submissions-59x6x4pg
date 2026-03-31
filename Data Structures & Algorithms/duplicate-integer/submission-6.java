class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use set to see if there is any repeating characters
        HashSet<Integer> set=new HashSet<>();
        for(int a:nums){
            // if set.add(a) returns false then it means that the value has already been seen before 
            if(set.add(a)==false){
                return true;
            }
        }
        // If after complete traversal the inner loop is not triggered means there are no duplicates present. Hence we return false
        return false;
    }
}