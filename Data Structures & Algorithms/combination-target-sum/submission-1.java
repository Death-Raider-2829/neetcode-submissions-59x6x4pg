class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(nums,target,ans,list,0);

        return ans;
    }

    void helper(int[] nums,int target,List<List<Integer>> ans,List<Integer> list,int index){
        if(index==nums.length){
            return;
        }
        
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        helper(nums,target-nums[index],ans,list,index);
        list.remove(list.size()-1);
        index++;
        helper(nums,target,ans,list,index);
    }
}
