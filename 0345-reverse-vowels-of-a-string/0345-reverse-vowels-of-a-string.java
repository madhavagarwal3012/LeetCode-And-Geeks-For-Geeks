class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList();
        String reversedVowelString = "";
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i'  || s.charAt(index) == 'o'  || s.charAt(index) == 'u' || s.charAt(index) == 'A' || s.charAt(index) == 'E' || s.charAt(index) == 'I'  || s.charAt(index) == 'O'  || s.charAt(index) == 'U'){
                vowels.add(s.charAt(index));
            }
        }

        int reversedIndex = vowels.size() - 1;
        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i'  || s.charAt(index) == 'o'  || s.charAt(index) == 'u' || s.charAt(index) == 'A' || s.charAt(index) == 'E' || s.charAt(index) == 'I'  || s.charAt(index) == 'O'  || s.charAt(index) == 'U'){
                reversedVowelString += vowels.get(reversedIndex);
                reversedIndex--;
            }
            else{
                reversedVowelString += s.charAt(index);
            }
        }
        return reversedVowelString;
    }
}