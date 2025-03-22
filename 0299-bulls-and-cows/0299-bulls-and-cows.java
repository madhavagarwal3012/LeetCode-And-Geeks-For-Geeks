class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> secretMap = new HashMap<>();
        for(int index = 0; index < secret.length(); index++){
            if(!secretMap.containsKey(secret.charAt(index))){
                secretMap.put(secret.charAt(index), 1);
            }
            else{
                secretMap.put(secret.charAt(index), secretMap.get(secret.charAt(index)) + 1);
            }
        }
        int bulls = 0;
        int cows = 0;
        for(int index = 0; index < secret.length(); index++){
            if(secret.charAt(index) == guess.charAt(index)){
                if(secretMap.get(guess.charAt(index)) > 0){
                    secretMap.put(guess.charAt(index), secretMap.get(guess.charAt(index)) - 1);
                    bulls++;
                }
                else{
                    secretMap.remove(guess.charAt(index));
                }
            }
        }
        for(int index = 0; index < secret.length(); index++){
            if(secret.charAt(index) != guess.charAt(index) && secretMap.containsKey(guess.charAt(index))){
                if(secretMap.get(guess.charAt(index)) > 0){
                    secretMap.put(guess.charAt(index), secretMap.get(guess.charAt(index)) - 1);
                    cows++;
                }
            }
        }
        return "" + bulls + "A" + cows + "B";
    }
}