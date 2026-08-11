class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> list=new ArrayList<>();

        for(int key:map.keySet()){
            list.add(key);
        }

        Collections.sort(list,(a,b)->{
            return map.get(b)-map.get(a);
        });

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}
