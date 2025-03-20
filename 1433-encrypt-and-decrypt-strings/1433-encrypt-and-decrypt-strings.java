import java.util.*;

class Encrypter {
    char[] keys;
    String[] values;
    String[] dictionary;

    private HashMap<Character, Integer> keyMap = new HashMap<>();
    private HashMap<String, ArrayList<Integer>> valueMap = new HashMap<>();
    private HashMap<String, Boolean> dictionaryMap = new HashMap<>();
    private HashMap<String, Integer> encryptedDictionary = new HashMap<>();
    private List<Integer> indexList;

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        this.keys = keys;
        for (int index = 0; index < keys.length; index++) {
            keyMap.put(keys[index], index);
        }
        this.values = values;
        for (int index = 0; index < values.length; index++) {
            valueMap.computeIfAbsent(values[index], k -> new ArrayList<>()).add(index);
        }
        this.dictionary = dictionary;
        for (String word : dictionary) {
            dictionaryMap.put(word, true);
        }
        for (String word : dictionary) {
            String encryptedWord = encrypt(word);
            encryptedDictionary.put(encryptedWord, encryptedDictionary.getOrDefault(encryptedWord, 0) + 1);
        }
    }

    public String encrypt(String word1) {
        String encryptedString = "";
        indexList = new ArrayList<>();
        for(int index = 0; index < word1.length(); index++){
            if(!keyMap.containsKey(word1.charAt(index))){
                return "";
            }
            else{
                indexList.add(keyMap.get(word1.charAt(index)));
            }
        }
        for(int index = 0; index < indexList.size(); index++){
            encryptedString += values[indexList.get(index)];
        }
        return encryptedString;
    }
    
    public int decrypt(String word2) {
        return encryptedDictionary.getOrDefault(word2, 0);
    }
}
