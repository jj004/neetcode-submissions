class Solution {
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        Set<String> validEmail = new TreeSet<>();
        for(int i = 0; i < emails.length; i++){
            String[] e = emails[i].split("@");
            if(!e[0].isEmpty() || !e[1].isEmpty()){
                String[] str = e[0].split("\\+");
                if(!str[0].isEmpty()){
                    String data = str[0];
                    String temp = "";
                    for(int j = 0; j < data.length(); j++){
                        if(data.charAt(j)!='.'){
                            temp += data.charAt(j);
                        }
                    }
                    if(!validEmail.contains(temp)){
                        validEmail.add(temp+"@"+e[1]);
                    }
                }
            }
        }
        return validEmail.size();
    }
}