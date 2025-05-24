class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int index = 0; index < words.length; index++){
            String word = words[index];
            if(set.contains(word)){
                list.add(index);
                continue;
            }
            for(int wordIndex = 0; wordIndex < word.length(); wordIndex++){
                if(word.charAt(wordIndex) == x){
                    list.add(index);
                    set.add(word);
                    break;
                }
            }
        }
        return list;
    }
}