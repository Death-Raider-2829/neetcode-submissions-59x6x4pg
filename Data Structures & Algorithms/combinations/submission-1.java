class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int start=1;
        int end=n;
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        helper(k,start,end,list,ans);
        return ans;
    }

    void helper(int k, int start, int end, List<Integer> list,List<List<Integer>> ans){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<=end;i++){
            list.add(i);
            helper(k,i+1,end,list,ans);
            list.remove(list.size()-1);
        }

        
    }
}