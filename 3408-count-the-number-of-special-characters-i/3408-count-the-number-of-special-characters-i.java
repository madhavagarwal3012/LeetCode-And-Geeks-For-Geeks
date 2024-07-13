class Solution {
    public int numberOfSpecialChars(String word) {
        int specialCharacterCount = 0;
        ArrayList<Character> characterList = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int index = 0; index < word.length(); index++){
            if(!map.containsKey(word.charAt(index))){
                characterList.add(word.charAt(index));
                map.put(word.charAt(index),1);
            }
            else{
                map.put(word.charAt(index),map.get(word.charAt(index))+1);
            }
        }
        for(int index = 0; index < characterList.size(); index++){
            int charValue = (int)characterList.get(index);
            if(charValue > 64 && charValue < 91){
                if(map.containsKey((char)(charValue+32))){
                    specialCharacterCount++;
                }
            }
        }
        return specialCharacterCount;
    }
}