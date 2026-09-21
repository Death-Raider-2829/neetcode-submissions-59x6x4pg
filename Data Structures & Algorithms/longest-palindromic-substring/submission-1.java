class Solution {
    public String longestPalindrome(String s) {
        String evenLength="";
        String oddLength="";
        for(int i=0;i<s.length();i++){
            String len=helper(s,i,i);
            oddLength=(oddLength.length()>len.length())?oddLength:len;
        }
        for(int i=1;i<s.length();i++){
            String len="";
            if(s.charAt(i)!=s.charAt(i-1))continue;
            else len=helper(s,i,i-1);
            evenLength=(evenLength.length()>len.length())?evenLength:len;
        }

        return (oddLength.length()>evenLength.length())?oddLength:evenLength;
    }

    String helper(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
}
