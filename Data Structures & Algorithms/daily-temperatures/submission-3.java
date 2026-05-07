class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> index=new Stack<>();
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[temperatures.length];
        

        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=temperatures[i]){
                
                st.pop();
                index.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=index.peek()-i;
            }
                st.push(temperatures[i]);
                index.push(i);
            
        }
        return ans;
    }
}
