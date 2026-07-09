class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left=0,right=people.length-1;
        Arrays.sort(people);
        int[] used=new int[people.length];
        int boat=0;

        int count=0;
        while(left<=right){
            if(used[right]==1){
                right--;
                continue;
            }
            int sum=people[right];
            if(sum==limit){
                used[right]=1;
                right--;
                boat++;
                continue;
            }

            if(sum<limit){
                if(sum+people[left]<=limit){
                    right--;
                    left++;
                    boat++;
                }
                else{
                    right--;
                    boat++;
                }
            }
        }
        return boat;
    }
}