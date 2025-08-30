class Solution {
    public String customSortString(String order, String s) {
        HashSet<Character> orderSet = new HashSet<>();
        for(int index = 0; index < order.length(); index++){
            orderSet.add(order.charAt(index));
        }
        StringBuilder remainingString = new StringBuilder();
        HashMap<Character, Integer> characterFrequencyMap = new HashMap<>();
        for(int index = 0; index < s.length(); index++){
            if(!orderSet.contains(s.charAt(index))){
                remainingString.append(s.charAt(index));
            }
            if(!characterFrequencyMap.containsKey(s.charAt(index))){
                characterFrequencyMap.put(s.charAt(index), 1);
                
            }
            else{
                characterFrequencyMap.put(s.charAt(index), characterFrequencyMap.get(s.charAt(index)) + 1);
            }
        }
        StringBuilder csString = new StringBuilder();
        for(int index = 0; index < order.length(); index++){
            if(characterFrequencyMap.containsKey(order.charAt(index))){
                int frequency = characterFrequencyMap.get(order.charAt(index));
                while(frequency > 0){
                    csString.append(order.charAt(index));
                    frequency--;
                }
            }
        }
        csString.append(remainingString);
        return csString.toString();
    }
}