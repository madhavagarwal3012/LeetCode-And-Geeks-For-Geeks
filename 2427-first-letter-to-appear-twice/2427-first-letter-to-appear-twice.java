class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> characterSet = new HashSet<>();
        char uniqueCharacter = ' ';
        for(int index = 0; index < s.length(); index++){
            if(!characterSet.contains(s.charAt(index))){
                characterSet.add(s.charAt(index));
            }
            else{
                uniqueCharacter = s.charAt(index);
                break;
            }
        }
        return uniqueCharacter;
    }
}