class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        // Find the entire cost of going through the first to the last index
        for(int i = 0; i < gas.length; i++){
            total += (gas[i] - cost[i]);
        }
        if(total < 0) return -1;
        total = 0;
        int res = 0;

        // Modified kadane
        for(int i = 0; i < gas.length; i++){
            total += (gas[i] - cost[i]);
            if(total < 0){
                total = 0;
                res = i + 1;
            }
        }

        return res;
    }
}
