class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int max=0;
        int maxFreq=0;
        int[] alpha=new int[26];

        while(right<s.length()){
            char ch=s.charAt(right);
            alpha[(int)(ch-'A')]++;
            int freq=alpha[(int)(ch-'A')];
            if(freq>maxFreq) maxFreq=freq;

            if((right-left+1)-maxFreq>k) {
                char leaving=s.charAt(left);
                alpha[(int)(leaving-'A')]--;
                left++;
            }

            if((right-left+1)>max) max=right-left+1;
            right++;
        }


        return max;
    }
}
