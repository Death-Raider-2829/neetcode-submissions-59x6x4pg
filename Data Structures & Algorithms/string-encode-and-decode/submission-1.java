class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int j=i;
            StringBuilder sb=new StringBuilder();
            StringBuilder len=new StringBuilder();
            while(str.charAt(j)!='#'){
                len.append(str.charAt(j));
                j++;
            }

            int length=Integer.parseInt(len.toString());
            // i=j+1;
            // int k=0;
            // while(k<length){
            //     sb.append(str.charAt(i+k));
            //     k++;
            // }
            // i=j+1+length;

            sb.append(str.substring(j+1,j+1+length));
            i=j+1+length;
            list.add(sb.toString());
        }

        return list;
    }
}
