// Create a Triplet Class That contains eqTime pTime and orig_index

class Triplet{
int eqTime;
int pTime;
int orig_index;

public Triplet(int eqTime,int pTime,int orig_index){
    this.eqTime=eqTime;
    this.pTime=pTime;
    this.orig_index=orig_index;
}
}

class Solution {
    public int[] getOrder(int[][] tasks) {
        // List to store the triplets
        List<Triplet> list=new ArrayList<>();

        // Sort Priority Queue based on two things
        // 1. Primarily based on processing time
        // 2. Secondarily basd on index
        PriorityQueue<Triplet> pq=new PriorityQueue<>((a,b)->{
            if(a.pTime==b.pTime){
                return a.orig_index-b.orig_index;
            }
            return a.pTime-b.pTime;
        });

        // A list to store the final index as tasks get processed
        List<Integer> ans=new ArrayList<>();

        // Adding tasks to the list
        for(int i=0;i<tasks.length;i++){
            Triplet t=new Triplet(tasks[i][0],tasks[i][1],i);
            list.add(t);
        }

        // Sorting on list is based on two things
        // 1. Sort based on eq Time
        // 2. Sort based on orignal indexes
        list.sort((a,b)->{
            if(a.eqTime==b.eqTime){
                return a.orig_index-b.orig_index;
            }
            return a.eqTime-b.eqTime;
        });

        // The variable called time stores the current time in the cpu clock
        int time=list.get(0).eqTime;
        int i=0;
        int size=list.size();

        // THIS LOOP STRUCTURE IS IMPORTANT
        while(i<size || !pq.isEmpty()){
            // Add to the PQ until the time in the cpu-clock is greater than the eqTime
            while(i<list.size() && time>=list.get(i).eqTime){
                pq.add(list.get(i));
                i++;
            }

            // If the priority queue is somehow empty but the list is not then that means that the value of eq Time for the next task is much much greater than what is currently stored in the cpu-clock. Hence we equate the cpu-clock equal to the eqTime for the next taks to continue our execution cycle
            if(pq.isEmpty()){
                time=list.get(i).eqTime;
                continue;  
            }

            // This is very very important. we do poll here so that just in case the pq is empty then pq.poll() returns null instead of index or reference error
            Triplet current=pq.poll();
            int index=current.orig_index;
            ans.add(index);
            // Finally we add the processing time to the cpu-clock
            time+=current.pTime;
        }

        int[] res=new int[ans.size()];
        for(i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
    }
}