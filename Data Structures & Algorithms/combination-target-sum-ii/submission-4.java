class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);

        helper(0,candidates,target,ans,list);

        return ans;
    }

    void helper(int index,int[] candidates,int target, List<List<Integer>> ans,List<Integer> list){
        if(index==candidates.length || target<0)return;

        if(target-candidates[index]==0){
            list.add(candidates[index]);
            
            ans.add(new ArrayList<>(list));
            
            list.remove(list.size()-1);
            return;
        }
        list.add(candidates[index]);
        helper(index+1,candidates,target-candidates[index],ans,list);
        while(index<candidates.length-1 && candidates[index]==candidates[index+1])index++;
        list.remove(list.size()-1);
        helper(index+1,candidates,target,ans,list);
    }
}
