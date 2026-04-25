class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> added=new ArrayList<>();
        int index=0;
        Arrays.sort(nums);

        helper(nums,result,added,index,set);

        return result;
    }

    void helper(int[] nums,List<List<Integer>> result, List<Integer> added, int index, Set<List<Integer>> set){
        if(index==nums.length){
            if(!set.contains(added)){
                result.add(new ArrayList<>(added));
                set.add(added);
            }
            return;
        }

        // Take
        added.add(nums[index]);
        index++;

        helper(nums, result, added, index,set);

        // Backtrack
        added.remove(added.size()-1);

        // Not Take
        helper(nums, result, added, index,set);
    }
}
