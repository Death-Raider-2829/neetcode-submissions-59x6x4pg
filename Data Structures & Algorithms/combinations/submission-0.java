class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        helper(1,n,k,ans,list);

        return ans;
    }

    void helper(int index,int n,int k,List<List<Integer>> ans,List<Integer> list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index>n)return;

        list.add(index);
        helper(index+1,n,k,ans,list);
        list.remove(list.size()-1);
        helper(index+1,n,k,ans,list);
    }
}