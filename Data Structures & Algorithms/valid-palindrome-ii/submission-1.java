class Solution {
    public boolean validPalindrome(String s) {

        boolean done=false;
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j) && done)return false;

            if(s.charAt(i)!=s.charAt(j) && !done){
                boolean rml=helper(s,i);
                boolean rmr=helper(s,j);
                if(!(rml || rmr)) return false;
                done=true;
                if(rml==true) i++;
                else j--;
            } 
        }

        return true;
    }

    boolean helper(String s,int index){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(index!=i){
                sb.append(s.charAt(i));
            }
        }

        String str=sb.toString();

        for(int i=0,j=s.length()-2;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j))return false;
        }

        return true;
    }
}