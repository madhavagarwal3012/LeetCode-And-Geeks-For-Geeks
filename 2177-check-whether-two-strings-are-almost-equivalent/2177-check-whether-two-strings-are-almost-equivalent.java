class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequencyArray = new int[26];
        for(int index = 0; index < word1.length() && index < word2.length(); index++){
            frequencyArray[word1.charAt(index) - 97]++;
            frequencyArray[word2.charAt(index) - 97]--;
        }
        for(int index = 0; index < frequencyArray.length; index++){
            if(Math.abs(frequencyArray[index]) > 3){
                return false;
            }
        }
        return true;
    }
}