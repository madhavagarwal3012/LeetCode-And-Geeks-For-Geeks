class Solution {
    public String toLowerCase(String str) {
        if(str.length()==1){
            return str;
        }
        else{
            String lower="";
            int i=0;
            
            while(i<str.length()){
                int ascii= str.charAt(i);
                if(ascii>=65 && ascii<=90 ){
                  lower+=(char)(ascii+32);
                }
                else{
                   lower+=str.charAt(i);
                }
                  
                i++;
            }
            return lower;
        }
    }
}