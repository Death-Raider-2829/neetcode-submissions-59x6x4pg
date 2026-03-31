class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Solve by lambda functions and map
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(!(result.contains(nums[i]))){
                result.add(nums[i]);
            }
        }
        // Sorts in decending order via lambda function
        result.sort((a,b) -> map.get(b)- map.get(a));

        int[] finalResult=new int[k];

        for(int i=0;i<k;i++){
            finalResult[i]=result.get(i);
        }
        return finalResult;
    }
}
