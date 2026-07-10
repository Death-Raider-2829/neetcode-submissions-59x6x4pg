class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack();
        for(int i=0;i<asteroids.length;i++){
            boolean equal=false;
            if(asteroids[i]>0)st.push(asteroids[i]);
            else{
                while(!st.isEmpty() && st.peek()<=asteroids[i]*-1){
                    if(st.peek()<0) break;
                    if(st.peek()==asteroids[i]*-1){
                        st.pop();
                        equal=true;
                        break;
                    }
                    st.pop();
                }
                if((st.isEmpty() || st.peek()<0) && equal!=true) st.push(asteroids[i]);
            }
        }
        int[] ans=new int[st.size()];
        int x=ans.length-1;
        while(!st.isEmpty()){
            ans[x]=st.pop();
            x--;
        }
        return ans;
    }
}