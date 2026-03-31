class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal then the strings cannot be strings
        if(s.length()!=t.length()){
            return false;
        }
        // There could be two solutions. One to sort and compare each term of both strings. another to store in hash map
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0;j<t.length();j++){
            if(!map.containsKey(t.charAt(j))){
                return false;
            }
            int value=map.get(t.charAt(j));
            if(value==1){
                map.remove(t.charAt(j));
            }
            else{
                map.put(t.charAt(j),value-1);
            }
        }
        return true;
    }
}
