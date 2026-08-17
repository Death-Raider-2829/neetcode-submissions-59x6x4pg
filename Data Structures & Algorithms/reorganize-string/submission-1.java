class Node{
    char ch;
    int freq;

    public Node(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}

class Solution {
    public String reorganizeString(String s) {
        int[] alpha=new int[26];
        int max=0;
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{
            if(a.freq==b.freq){
                return (int)b.ch-(int)a.ch;
            }
            return b.freq-a.freq;
        });
        Queue<Node> q=new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
            int index=(int)(s.charAt(i)-'a');
            alpha[index]++;
            if(alpha[index]>max)max=alpha[index];
        }

        for(int i=0;i<26;i++){
            if(alpha[i]!=0){
                Node n=new Node((char)(i+'a'),alpha[i]);
                pq.add(n);
            }
        }
        if((float)max>(float)(s.length()+1)/2){
            return "";
        }

        StringBuilder sb=new StringBuilder();
        Node prev=null;
        Node curr=null;

        while(!pq.isEmpty()){
            if(!pq.isEmpty()){
                curr=pq.poll();
                sb.append(curr.ch);
                curr.freq-=1;
                if(prev==null || prev.freq==0){
                    prev=curr;
                }
                else if(prev.ch!=curr.ch && prev.freq!=0){
                    pq.add(prev);
                    prev=curr;
                }

            }

            // if(!q.isEmpty()){
            //     pq.add(q.poll());
            // }
            // else{
            //     prev=curr;
            // }
        }

        return sb.toString();
    }
}