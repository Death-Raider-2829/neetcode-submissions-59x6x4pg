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
        List<Triplet> list=new ArrayList<>();

        PriorityQueue<Triplet> pq=new PriorityQueue<>((a,b)->{
            if(a.pTime==b.pTime){
                return a.orig_index-b.orig_index;
            }
            return a.pTime-b.pTime;
        });

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<tasks.length;i++){
            Triplet t=new Triplet(tasks[i][0],tasks[i][1],i);
            list.add(t);
        }

        list.sort((a,b)->{
            if(a.eqTime==b.eqTime){
                return a.orig_index-b.orig_index;
            }
            return a.eqTime-b.eqTime;
        });


        int time=list.get(0).eqTime;
        int i=0;
        int size=list.size();


        while(i<size || !pq.isEmpty()){
            while(i<list.size() && time>=list.get(i).eqTime){
                pq.add(list.get(i));
                i++;
            }

            if(pq.isEmpty()){
                time=list.get(i).eqTime;
                continue;  
            }

            Triplet current=pq.poll();
            int index=current.orig_index;
            ans.add(index);
            time+=current.pTime;
        }

        int[] res=new int[ans.size()];
        for(i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
    }
}