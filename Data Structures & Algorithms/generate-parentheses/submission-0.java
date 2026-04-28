class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> list=new ArrayList<>();
     StringBuilder sb=new StringBuilder();
     helper("",list,0,0,n);   
     return list;
    }

    void helper(String sb, List<String> list,int open,int close,int max){
        if(open+close==max*2){
            list.add(sb.toString());
        }

        if(open<max){
            helper(sb+"(",list,open+1,close,max);
        }
        

        if(close<open){
            helper(sb+")",list,open,close+1,max);
        }
    }
}
