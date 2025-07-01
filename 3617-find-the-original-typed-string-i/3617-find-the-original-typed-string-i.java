class Solution {
    public int possibleStringCount(String word) {
        int countOfPossibleStrings = 1;
        for(int index = 0; index < word.length(); index++){
            int characterIndex = index;
            while(characterIndex < word.length() - 1 && word.charAt(characterIndex) == word.charAt(characterIndex + 1)){
                characterIndex++;
                countOfPossibleStrings++;
            }
            index = characterIndex;
        }
        return countOfPossibleStrings;
    }
}