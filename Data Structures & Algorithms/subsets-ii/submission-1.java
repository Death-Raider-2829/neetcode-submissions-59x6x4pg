class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> added=new ArrayList<>();
        int index=0;
        Arrays.sort(nums);

        helper(nums,result,added,index);

        return result;
    }

    void helper(int[] nums,List<List<Integer>> result, List<Integer> added, int index){
        if(index==nums.length){
            result.add(new ArrayList<>(added));    
            return;
        }

        // Take
        added.add(nums[index]);

        helper(nums, result, added, index+1);

        // Backtrack
        added.remove(added.size()-1);
        while(index!=nums.length-1 && nums[index]==nums[index+1]){
            index++;
        }

        // Not Take
        helper(nums, result, added, index+1);
    }
}
