class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        int length=0;

        for(int right=0;right<s.length();right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
                 if(((right-left)+1)>maxLength){
                    maxLength=(right-left)+1;
                 }
        }

        return maxLength;
    }
}
