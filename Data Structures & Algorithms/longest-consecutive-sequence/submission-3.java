class Solution {
    public int longestConsecutive(int[] nums) {
        // Convert array to set to have O(1) lookup
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        // Use hashMap to track the start of a sequence and the sequence itself
        HashMap<Integer,List<Integer>> map=new HashMap<>();

        for(int a:set){
            if(!set.contains(a-1)){
                int orignal=a;
                while(true){
                    // Get an already existing list of integers or create a new one
                    List<Integer> list=map.getOrDefault(orignal,new ArrayList<>());
                    list.add(a);
                    if(!set.contains(a+1)){
                        map.put(orignal,list);
                        break;
                    }
                    else{
                        map.put(orignal,list);
                        a=a+1;
                    }
                }
            }
        }
        int maxSize=0;
        for(int start:map.keySet()){
            List<Integer> fin=map.get(start);
            int size=fin.size();
            if(size>maxSize){
                maxSize=size;
            }
        }
        return maxSize;

    }
}
