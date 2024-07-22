class Solution {
    public boolean halvesAreAlike(String s) {
        HashMap<Character, Boolean> vowels = new HashMap<>();
        vowels.put('a', true);
        vowels.put('e', true);
        vowels.put('i', true);
        vowels.put('o', true);
        vowels.put('u', true);
        vowels.put('A', true);
        vowels.put('E', true);
        vowels.put('I', true);
        vowels.put('O', true);
        vowels.put('U', true);

        int firsthalfvowelCount = 0;
        for(int index = 0; index < s.length()/2; index++){
            if(vowels.containsKey(s.charAt(index))){
                firsthalfvowelCount++;
            }
        }
        int secondhalfvowelCount = 0;
        for(int index = s.length()/2; index < s.length(); index++){
            if(vowels.containsKey(s.charAt(index))){
                secondhalfvowelCount++;
            }
        }
        return firsthalfvowelCount == secondhalfvowelCount;
    }
}