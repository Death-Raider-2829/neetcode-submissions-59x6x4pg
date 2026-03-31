class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        // fix one element as the target
        for(int i=0;i<nums.length-2;i++){
            int target=nums[i]*-1;
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> newL=new ArrayList<>();
                    newL.add(nums[i]);
                    newL.add(nums[j]);
                    newL.add(nums[k]);
                    set.add(newL);
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }

        for(List<Integer> res1:set){
            result.add(res1);
        }
        return result;
    }
}
