class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // We make a map that stores a string that in form of the letters and their frequency that make up the elements...the ones with same frequency are added in same list
        HashMap<String,List<String>> result=new HashMap<>();
        List<List<String>> finalresult=new ArrayList<>();
        for(String str:strs){
        int[] alpha=new int[26];
        // Count frequency
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                int n=(int)(ch-'a');
                alpha[n]++;
            }
            // Add the frequencies and elements as a string in map
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                if(alpha[i]!=0){
                    char ch=(char)('a'+i);
                    sb.append(alpha[i]);
                    sb.append(ch);
                }
            }
            String s=sb.toString();
            
            List<String> same=result.getOrDefault(s,new ArrayList<>());
            same.add(str);
            result.put(s,same);
            

        }

        for(String str:result.keySet()){
            finalresult.add(result.get(str));
        }
        return finalresult;
    }
}
