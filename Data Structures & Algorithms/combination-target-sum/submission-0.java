class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> added=new ArrayList<>();
        int index=0;
        helper(nums,added,target,result,index);

        return result;
    }

    void helper(int[] nums,List<Integer> added,int target,List<List<Integer>> result,int index){
        if(target==0){
            result.add(new ArrayList<>(added));
            return;
        }

        if(target<0 || index==nums.length){
            return;
        }
        target-=nums[index];
        added.add(nums[index]);

        helper(nums,added,target,result,index);
        
        target+=nums[index];
        added.remove(added.size()-1);
        index++;

        helper(nums,added,target,result,index);
    }
}
