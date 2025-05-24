class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int index = 0; index < words.length; index++){
            String word = words[index];
            for(int wordIndex = 0; wordIndex < word.length(); wordIndex++){
                if(word.charAt(wordIndex) == x){
                    list.add(index);
                    break;
                }
            }
        }
        return list;
    }
}