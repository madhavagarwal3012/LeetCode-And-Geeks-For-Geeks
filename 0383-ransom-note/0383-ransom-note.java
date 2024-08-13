class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int index = 0; index < magazine.length(); index++){
            if(!map1.containsKey(magazine.charAt(index))){
                map1.put(magazine.charAt(index), 1);
            }
            else{
                map1.put(magazine.charAt(index), map1.get(magazine.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < ransomNote.length(); index++){
            if(!map2.containsKey(ransomNote.charAt(index))){
                map2.put(ransomNote.charAt(index), 1);
            }
            else{
                map2.put(ransomNote.charAt(index), map2.get(ransomNote.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < ransomNote.length(); index++){
            if(!map1.containsKey(ransomNote.charAt(index))){
                return false;
            }
            else if(map1.get(ransomNote.charAt(index)) < map2.get(ransomNote.charAt(index))){
                return false;
            }
        }
        return true;
    }
}