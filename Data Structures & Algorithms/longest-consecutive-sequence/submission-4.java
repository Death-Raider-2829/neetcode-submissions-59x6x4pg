class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        int count=0;

        for(int i=0;i<list.size();i++){
            int c=0;
            if(!list.contains(list.get(i)-1)){
                int j=0;
                while(list.contains(list.get(i)+j)){
                    j++;
                }

                if(j>count)count=j;
            }
        }

        return count;
    }
}
