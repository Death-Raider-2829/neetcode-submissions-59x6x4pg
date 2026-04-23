class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> added = new ArrayList<>();
        Arrays.sort(candidates);
        int index = 0;

        helper(candidates, target, result, added, index);

        return result;
    }

    void helper(
        int[] candidates, int target, List<List<Integer>> result, List<Integer> added, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(added));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Take
        added.add(candidates[index]);
        

        // Explore
        helper(candidates, target-candidates[index], result, added, index+1);

        // Backtrack
        
        added.remove(added.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1]){
            index++;
        }

        // Not Take
        helper(candidates, target, result, added, index+1);
    }
}
