class Solution {
    public int countSubstrings(String s) {
        int[] fin=new int[s.length()];

        for(int i=0;i<fin.length;i++){
            int len=helper(s,i,i);
            fin[i]+=len;
        }

        for(int i=1;i<fin.length;i++){
            int len=0;
            if(s.charAt(i)!=s.charAt(i-1))continue;
            else{
                len=helper(s,i-1,i);
                fin[i]+=len;
            }
        }

        int total=0;
        for(int i=0;i<fin.length;i++){
            total+=fin[i];
        }

        return total;
    }

    int helper(String s,int left,int right){
        if(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            return 1+helper(s,left-1,right+1);
        }
        else{
            return 0;
        }
    }
}
