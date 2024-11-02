class Solution {
    public boolean isCircularSentence(String sentence) {
        for(int index = 0; index < sentence.length(); index++){
            if(sentence.charAt(index) == ' '){
                if(sentence.charAt(index - 1) != sentence.charAt(index + 1)){
                    return false;
                }
            }
        }
        return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
    }
}