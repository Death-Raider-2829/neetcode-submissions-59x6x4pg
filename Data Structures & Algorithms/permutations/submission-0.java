class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        boolean[] taken=new boolean[nums.length];
        int i=0;

        permutation(result,nums,res,taken);

        return result;    
    }

    public void permutation(List<List<Integer>> result,int[] nums,List<Integer> res,boolean[] taken){
        if(res.size()==nums.length){
            result.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(taken[i]==true) continue;

            res.add(nums[i]);
            taken[i]=true;
            

            permutation(result,nums,res,taken);

            
            res.remove(res.size()-1);
            taken[i]=false;

            
        }
    }

}
