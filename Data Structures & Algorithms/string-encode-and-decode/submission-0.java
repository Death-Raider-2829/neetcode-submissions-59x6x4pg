class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            int n=strs.get(i).length();
            sb.append(n);
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> st=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int n=0;
            while(str.charAt(i)!='#'){
                n=n*10+(int)(str.charAt(i)-'0');
                i++;
            }
            i++;
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(str.charAt(i));
                i++;
            }
            st.add(sb.toString());
        }
        return st;
    }
}
