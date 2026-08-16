// A node class to store tim and frequency
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
        // Queue is used to add the task that has been used
        Queue<Node> q=new LinkedList<>();
        // PriorityQueue is used to seggregate the tasks based on their frequency in decreasing order
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
            // If priority Queue is not empty then we remove the current task...and reduce its frequency
            if(!pq.isEmpty()){
                curr=pq.remove();
                curr--;
            }
            // If current task's frequency is not zero after reduction then it is added into the waiting queue for processing
            if(curr!=0){
                Node node=new Node(curr,time+n);
                q.add(node);
            }

            // If the waiting time of priority queue matches the current time then we remove it from waiting queue
            if(!q.isEmpty() && q.peek().time==time){
                int freq=q.poll().freq;

                pq.add(freq);
            }
            time++;
        }

        return time;

    }
}
