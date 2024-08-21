class Solution {
    public String defangIPaddr(String address) {
        
            StringBuilder sb= new StringBuilder();
        for(int i=0; i<address.length();i++){
            char ch=address.charAt(i);
            String ch1=Character.toString(ch);
            if(ch1.equals(".")){
                ch1="[.]";
                sb.append(ch1);
            }
            else{
                sb.append(ch1);
            }
        }

     String result_address=sb.toString();
        
        return result_address;
            }
}
