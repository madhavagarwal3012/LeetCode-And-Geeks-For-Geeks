class Solution {
    public String decodeMessage(String key, String message) {
        int alphabetCount = 0;
        String decodedMessage = "";
        HashMap<Character, Character> map = new HashMap<>();
        for(int index = 0; index < key.length(); index++){
            if((int)key.charAt(index) == 32){
                continue;
            }
            else if(!map.containsKey(key.charAt(index))){
                map.put(key.charAt(index), (char)('a' + alphabetCount));
                alphabetCount++;
            }
        }
        for(int index = 0; index < message.length(); index++){
            if((int)message.charAt(index) == 32){
                decodedMessage += ' ';
            }
            else if(map.containsKey(message.charAt(index))){
                decodedMessage += map.get(message.charAt(index));
            }
        }
        return decodedMessage;
    }
}