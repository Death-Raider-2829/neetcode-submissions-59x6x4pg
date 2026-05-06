class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        String base=strs[0];
        int i=0;
        boolean contains=true;
        while(i<base.length()){
            char compare=base.charAt(i);
            for(String str:strs){

                if(i>=str.length()){
                    contains=false;
                    break;
                }

                char ch=str.charAt(i);


                if(compare!=ch){
                    contains=false;
                    break;
                }

            }
            if(!contains) break;
            sb.append(compare);
            i++;
        }

        return sb.toString();
    }
}