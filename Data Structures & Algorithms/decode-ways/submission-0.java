class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        dp[s.length()-1] = s.charAt(s.length()-1) != '0' ? 1 : 0;
        return helper(s,0,dp);
        
    }

    int helper(String s,int start,int[] dp){
        if(start>=s.length())return 1;
        if(dp[start]!=-1)return dp[start];

        if(s.charAt(start)=='0')return 0;

        int once=helper(s,start+1,dp);
        int second=0;
        if(start+1<s.length() && Integer.parseInt(s.substring(start,start+2))<27) second=helper(s,start+2,dp);
        return dp[start]=once+second;
    }
}