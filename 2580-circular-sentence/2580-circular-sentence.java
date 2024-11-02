class Solution {
    public boolean isCircularSentence(String sentence) {
        boolean checkWords = false;
        for(int index = 0; index < sentence.length(); index++){
            if(sentence.charAt(index) == ' '){
                if(sentence.charAt(index - 1) != sentence.charAt(index + 1)){
                    return false;
                }
                checkWords = true;
            }
        }
        if(!checkWords){
            if(sentence.length() > 0){
                return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
            }
        }
        else{
            if(sentence.length() > 0){
                return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
            }
        }
        return true;
    }
}