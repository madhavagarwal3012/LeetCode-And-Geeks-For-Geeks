class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefCount = 0;
        for(int index = 0; index < words.length; index++){
            String word = words[index];
            String prefCheck = "";
            for(int wordIndex = 0; wordIndex < word.length() && wordIndex < pref.length() && word.length() >= pref.length(); wordIndex++){
                if(word.charAt(wordIndex) == pref.charAt(wordIndex)){
                    prefCheck += word.charAt(wordIndex);
                }
                else{
                    break;
                }
            }
            if(prefCheck.equals(pref)){
                prefCount++;
            }
        }
        return prefCount;
    }
}