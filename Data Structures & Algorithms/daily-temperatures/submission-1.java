class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> days=new Stack<>();
        int[] result=new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=temperatures[i]){
                st.pop();
                days.pop();
            }

            int difference=0;
            if(!days.isEmpty()){
                difference=days.peek()-i;
            }

            result[i]=difference;
            days.push(i);
            st.push(temperatures[i]);
        }
        return result;
    }
}
