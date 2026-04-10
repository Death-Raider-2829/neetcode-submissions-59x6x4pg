class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> array=new ArrayList<>();
        helper(result,nums,array,0);


        return result;
    }

    public void helper(List<List<Integer>> result,int[] nums, List<Integer> array,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(array));
            return;
        }

        // Take
        array.add(nums[i]);
        i++;

        helper(result,nums,array,i);

        // Backtrack
        array.remove(array.size()-1);

        // Not Take

        helper(result,nums,array,i);
    } 
}
