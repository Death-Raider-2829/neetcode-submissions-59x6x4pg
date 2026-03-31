class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> mails=new HashSet<>();
        for(String mail:emails){
            StringBuilder LocalName=new StringBuilder();
            int Local=0;
            for(int i=0;i<mail.length();i++){
                if(Local==0){
                    if(mail.charAt(i)=='.'){
                        continue;
                    }
                    if(mail.charAt(i)=='+'){
                        while(mail.charAt(i)!='@'){
                            i++;
                            continue;
                        }
                        Local=1;
                    }
                    else{
                        LocalName.append(mail.charAt(i));
                    }
                }
                else{
                    LocalName.append(mail.charAt(i));
                }
            }
            mails.add(LocalName.toString());
        }

        int count=0;
        for(String mail:mails){
            count++;
        }
        return count;
    }
}