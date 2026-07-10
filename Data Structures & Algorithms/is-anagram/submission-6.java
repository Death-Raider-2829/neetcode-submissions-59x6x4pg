class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha=new int[26];
        int[] beta=new int[26];

        for(int i=0;i<s.length();i++){
            int index=(int)(s.charAt(i)-'a');
            alpha[index]++;
        }

        for(int i=0;i<t.length();i++){
            int index=(int)(t.charAt(i)-'a');
            beta[index]++;
        }

        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=beta[i])return false;
        }
        return true;
    }
}
