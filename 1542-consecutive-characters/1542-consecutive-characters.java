class Solution {
    public int maxPower(String s) {
        int maxcharCount=0;
        int charCount=1;
        int index=0;
        char character=' ';
        if(s.length()>0){
            character=s.charAt(0);
        }
        
        while(index<s.length()-1){
            if(character==s.charAt(index+1)){
                charCount++;
            }
            else{
                character=s.charAt(index+1);
                if(maxcharCount<charCount){
                    maxcharCount=charCount;
                }
                charCount=1;
            }
            index++;
        }
        if(maxcharCount<charCount){
            maxcharCount=charCount;
        }
        return maxcharCount;
    }
}