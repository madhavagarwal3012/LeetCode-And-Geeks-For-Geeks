class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int index = 0; index < s.length(); index++){
            if(!map.containsKey(s.charAt(index))){
                map.put(s.charAt(index), 1);
            }
            else{
                map.put(s.charAt(index), map.get(s.charAt(index)) + 1);
            }
        }
        for(int index = 0; index < s.length(); index++){
            if(map.get(s.charAt(index)) == 1){
                return index;
            }
        }
        return -1;
    }
}