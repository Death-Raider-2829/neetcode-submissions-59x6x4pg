class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }

        Stack<Character> sc=new Stack<>();

        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(sc.isEmpty()){
                sc.push(ch[i]);
            }
            else{
                char c=sc.peek();
                if(c=='(' && ch[i]==')'){
                    sc.pop();
                }
                else if(c=='[' && ch[i]==']'){
                    sc.pop();
                }
                else if(c=='{' && ch[i]=='}'){
                    sc.pop();
                }

                else{
                    sc.push(ch[i]);
                }
            }    
        }

        if(!sc.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}