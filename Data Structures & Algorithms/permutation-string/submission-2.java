class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] alpha=new int[26];

        for(int i=0;i<s1.length();i++){
            int pos=(int)(s1.charAt(i)-'a');
            alpha[pos]++;
        }

        int left=0;
        int right=0;
        int[] res=new int[26];
        for(int i=0;i<s1.length();i++){
            int pos=(int)(s2.charAt(i)-'a');
            res[pos]++;
            right++;
        }
        
        if(Arrays.equals(alpha,res)==true){
            return true;
        }

        while(right<s2.length()){
            

            int pos=(int)(s2.charAt(left)-'a');
            res[pos]--;
            left++;
            pos=(int)(s2.charAt(right)-'a');
            res[pos]++;
            right++;
            if(Arrays.equals(alpha,res)==true){
                return true;
            }
                        
        }
        return false;
    }
}
