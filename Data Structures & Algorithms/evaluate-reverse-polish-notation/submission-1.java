class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<tokens.length){
            String ch=tokens[i];
            if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")){
                if(st.isEmpty()){
                    return -1;
                }
                int b=st.pop();
                if(st.isEmpty()){
                    return -1;
                }
                int a=st.pop();
                if(ch.equals("+")) st.push(a+b);
                else if(ch.equals("-")) st.push(a-b);
                else if(ch.equals("*")) st.push(a*b);
                else if(ch.equals("/")){
                    if(b==0){
                        return -1;
                    }
                    else{
                        st.push(a/b);
                    }
                }
                else{
                    return -1;
                }
            }

            else{
                st.push(Integer.parseInt(ch));
            }
            i++;
        }
        return st.pop();
    }
}
