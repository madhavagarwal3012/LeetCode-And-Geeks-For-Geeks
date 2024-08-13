class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int index = 0; index < magazine.length(); index++){
            if(!map.containsKey(magazine.charAt(index))){
                map.put(magazine.charAt(index), 1);
            }
            else{
                map.put(magazine.charAt(index), map.get(magazine.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < ransomNote.length(); index++){
            if(!map.containsKey(ransomNote.charAt(index)) || map.get(ransomNote.charAt(index)) == 0){
                return false;
            }
            else {
                map.put(ransomNote.charAt(index), map.get(ransomNote.charAt(index)) - 1);
            }
        }
        return true;
    }
}