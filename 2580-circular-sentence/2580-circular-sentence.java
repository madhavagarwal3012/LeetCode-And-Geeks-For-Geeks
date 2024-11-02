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
        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
    }
}