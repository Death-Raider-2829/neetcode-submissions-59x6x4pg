class Node{
    int freq;
    int time;

    public Node(int freq,int time){
        this.freq=freq;
        this.time=time;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Queue<Node> q=new LinkedList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] alpha=new int[26];

        for(int i=0;i<tasks.length;i++){
            char alp=tasks[i];
            int index=(int)(alp-'A');

            alpha[index]++;
        }

        for(int i=0;i<alpha.length;i++){
            if(alpha[i]!=0){
                pq.add(alpha[i]);
            }
        }


        int time=0;

        while(!pq.isEmpty() || !q.isEmpty()){
            int curr=0;
            if(!pq.isEmpty()){
                curr=pq.remove();
                curr--;
            }
            
            if(curr!=0){
                Node node=new Node(curr,time+n);
                q.add(node);
            }
            if(!q.isEmpty() && q.peek().time==time){
                int freq=q.poll().freq;

                pq.add(freq);
            }
            time++;
        }

        return time;

    }
}
