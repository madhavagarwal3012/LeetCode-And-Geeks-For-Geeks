class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashMap<String, Boolean> map = new HashMap<>();
        int count = 0;
        for(int index = 0; index < bannedWords.length; index++){
            if(!map.containsKey(bannedWords[index])){
                map.put(bannedWords[index], true);
            }
        }
        for(int index = 0; index < message.length; index++){
            if(map.containsKey(message[index])){
                count++;
            }
        }
        return count >= 2;
    }
}