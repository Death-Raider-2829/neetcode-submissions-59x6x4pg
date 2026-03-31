class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] letters=new int[26];
        for(int i=0;i<s.length();i++){
            int character=(int)(s.charAt(i)-'a');
            letters[character]++;
        }

        for(int j=0;j<t.length();j++){
            int character=(int)(t.charAt(j)-'a');
            if(letters[character]==0){
                return false;
            }
            else{
                letters[character]--;
            }
        }
        return true;
    }
}
