class Solution {
    public String compressedString(String word) {
        String compressed = "";
        for(int index = 0; index < word.length(); index++){
            int frequency = 1;
            for(int subIndex = index + 1; subIndex < word.length(); subIndex++){
                if(word.charAt(index) == word.charAt(subIndex)){
                    frequency++;
                    if(frequency == 9){
                        index++;
                        break;
                    }
                }
                else{
                    break;
                }
                index++;
            }
            compressed += String.valueOf(frequency);
            compressed += word.charAt(index);
        }
        return compressed;
    }
}