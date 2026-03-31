class Solution {
    public boolean isPalindrome(String S) {
        // If the current character is not in alpha numeric range then simply skip the comparision...otherwise copare and reduce the window size
        int i=0;
        int j=S.length()-1;
        String s=S.toLowerCase();
        while(i<j){
            if(Character.isLetterOrDigit(s.charAt(i))&& Character.isLetterOrDigit(s.charAt(j))){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
            else{
                if(!Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                }
                if(!Character.isLetterOrDigit(s.charAt(j))){
                    j--;
                }
            }
        }

        return true;
    }
}
