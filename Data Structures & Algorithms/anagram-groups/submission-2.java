class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>(); 
        
        for(int x=0;x<strs.length;x++){

            StringBuilder sb=new StringBuilder();
            int[] alpha=new int[26];
            
            for(int i=0;i<strs[x].length();i++){
                char ch=strs[x].charAt(i);
                alpha[(int)(ch-'a')]++;
            }

            for(int i=0;i<alpha.length;i++){
                if(alpha[i]>0){
                    sb.append((char)(i+'a'));
                    sb.append(alpha[i]);
                }
            }

            List<String> added=map.getOrDefault(sb.toString(),new ArrayList<>());
            added.add(strs[x]);
            map.put(sb.toString(),added);
        }

        for(String key:map.keySet()){
            result.add(map.get(key));
        }

        return result;
    }
}
