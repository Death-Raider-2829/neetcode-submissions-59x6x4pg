class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest=strs[0];
        int i=Integer.MAX_VALUE;
        for(String str:strs){
            if(str.length()<i){
                shortest=str;
                i=str.length();
            }
        }

        StringBuilder sb=new StringBuilder();
        int j=0;
        boolean identical=true;
        while(j<i){
            for(int x=0;x<strs.length;x++){
                String str=strs[x];
                if(str.charAt(j)!=shortest.charAt(j)){
                    identical=false;
                    break;
                }
            }
            if(identical==true){
                sb.append(shortest.charAt(j));
            }
            else{
                break;
            }
            j++;
        }
        return sb.toString();

    }
}