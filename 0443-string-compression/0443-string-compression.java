class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> list = new ArrayList<>();
        if(chars.length == 1){
            return 1;
        }
        String compressed = "";
        for(int index = 0; index < chars.length; index++){
            int characterCount = 1;
            char character = chars[index];
            int initialIndex = index;
            while(index + 1 < chars.length && character == chars[index + 1]){
                characterCount++;
                index++;
            }
            String frequencyValue = String.valueOf(characterCount);
            if(characterCount == 1){
                compressed = compressed + chars[initialIndex];
                list.add(chars[index]);
            }
            else{
                    compressed = compressed + chars[initialIndex] + frequencyValue;
                list.add(chars[index]);
                for(int frequencyIndex = 0; frequencyIndex < frequencyValue.length(); frequencyIndex++){
                    list.add(frequencyValue.charAt(frequencyIndex));
                }
            }
        }
        for(int index = 0; index < compressed.length(); index++){
            chars[index] = list.get(index);
        }
        return compressed.length();
    }
}