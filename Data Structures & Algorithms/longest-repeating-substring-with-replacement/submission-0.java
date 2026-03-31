class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        int maxFreq=0;
        int left=0;
        int right=1;
        map.put(s.charAt(left),1);
        while(right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(map.get(s.charAt(right)),maxFreq);

            if((right-left+1)-maxFreq>k){
                while((right-left+1)-maxFreq>k){
                    int length=map.get(s.charAt(left));
                    if(length==1){
                        map.remove(s.charAt(left));
                    }
                    else{
                        map.put(s.charAt(left),--length);
                    }
                    left++;
                }
            }
            if(maxLength<(right-left+1)) maxLength=right-left+1;
            right++;
        }
        return maxLength;
    }
}
 