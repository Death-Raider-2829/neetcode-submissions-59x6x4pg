class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        Arrays.fill(used,false);

        helper(nums,used,list,ans,0);

        return ans;
    }

    void helper(int[] nums,boolean[] used,List<Integer> list,List<List<Integer>> ans,int index){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            list.add(nums[i]);
            used[i]=true;
            helper(nums,used,list,ans,0);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}
