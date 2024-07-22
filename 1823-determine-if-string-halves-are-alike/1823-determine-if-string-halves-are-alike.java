class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int firsthalfvowelCount = 0;
        for(int index = 0; index < s.length()/2; index++){
            if(vowels.contains(s.charAt(index))){
                firsthalfvowelCount++;
            }
        }
        int secondhalfvowelCount = 0;
        for(int index = s.length()/2; index < s.length(); index++){
            if(vowels.contains(s.charAt(index))){
                secondhalfvowelCount++;
            }
        }
        return firsthalfvowelCount == secondhalfvowelCount;
    }
}