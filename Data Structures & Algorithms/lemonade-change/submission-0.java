class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<bills.length;i++){
            int req=bills[i]-5;
            while(req>0){
                if((req==10 || req==15) && map.getOrDefault(10,0)!=0){
                    int ch=map.get(10);
                    ch--;
                    map.put(10,ch);
                    if(ch==0){
                        map.remove(10);
                    }
                    req-=10;
                }
                else if((req==5 || req==10 || req==15) && map.getOrDefault(5,0)>0){
                    int ch=map.get(5);
                    ch--;
                    map.put(5,ch);
                    if(ch==0){
                        map.remove(5);
                    }
                    req-=5;
                }
                else{
                    return false;
                }
                
            }
            map.put(bills[i],map.getOrDefault(bills[i],0)+1);
        }
        return true;
    }
}