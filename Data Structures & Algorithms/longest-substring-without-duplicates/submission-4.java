class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("") || s.length()==0){
            return 0;
        }
        int[] alpha=new int[128];
        int left=0;
        int right=0;
        int maxLength=0;
        while(right<s.length()){
            int position=(int)(s.charAt(right)-' ');
            while(left<right && alpha[position]!=0){
                int remove=(int)(s.charAt(left)-' ');
                alpha[remove]--;
                left++;
            }

            alpha[position]++;
            if((right-left+1)>maxLength){
                maxLength=right-left+1;
            }
            right++;
        }
        return maxLength;
    }
}
