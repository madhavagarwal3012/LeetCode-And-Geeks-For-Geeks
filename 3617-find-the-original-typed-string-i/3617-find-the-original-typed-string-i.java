class Solution {
    public int possibleStringCount(String word) {
        int countOfPossibleStrings = 1;
        for(int index = 0; index < word.length(); index++){
            while(index < word.length() - 1 && word.charAt(index) == word.charAt(index + 1)){
                index++;
                countOfPossibleStrings++;
            }
        }
        return countOfPossibleStrings;
    }
}