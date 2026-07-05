class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alpha=new int[26];
        int[] ans=new int[26];
        for(int i=0;i<s1.length();i++){
            int index=(int)(s1.charAt(i)-'a');
            alpha[index]++;
        }
        int j=0;

        for(int i=0;i<s2.length();i++){
            boolean find=true;
            while(j<s2.length() && j-i<s1.length()){
                int index=(int)(s2.charAt(j)-'a');
                ans[index]++;
                j++;
            }

            for(int x=0;x<alpha.length;x++){
                if(alpha[x]!=ans[x]) {
                    find=false;
                    break;
                }
            }

            if(find==true){
                return true;
            }

            char rem=s2.charAt(i);
            ans[(int)(rem-'a')]--;
        }
        
        return false;
    }
}
