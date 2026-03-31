class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        // Declare a list of list
        List<List<String>> result=new ArrayList<>();
        // Create a hashmap to store sorted word as key and actual word as key
        HashMap<String,List<String>> map=new HashMap<>();
       

        for(int i=0;i<str.length;i++){
            char[] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            List<String> list=map.getOrDefault(st,new ArrayList());
            list.add(str[i]);
            map.put(st,list);
        }

        for(String strs:map.keySet()){
            result.add(map.get(strs));
        }
        return result;
    }
}
