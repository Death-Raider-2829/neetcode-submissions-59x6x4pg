class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<bills.length;i++){
            map.put(bills[i],map.getOrDefault(bills[i],0)+1);

            int req = bills[i] - 5;

            while(req != 0){
                if(req >= 10){
                    int ten = map.getOrDefault(10,0);
                    if(ten > 0){
                        ten--;
                        req -= 10;
                        map.put(10, ten);
                    }

                    else if(map.getOrDefault(5,0) != 0){
                        int five = map.getOrDefault(5,0);
                        if(five >=0){
                            five--;
                            req -= 5;
                            map.put(5,five);
                        }
                    }
                    else{
                        return false;
                    }
                }
                
                else if(map.getOrDefault(5,0) != 0){
                    int five = map.getOrDefault(5,0);
                    if(five >=0){
                        five--;
                        req -= 5;
                        map.put(5,five);
                    }
                    else{
                        return false;
                    }
                }

                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}