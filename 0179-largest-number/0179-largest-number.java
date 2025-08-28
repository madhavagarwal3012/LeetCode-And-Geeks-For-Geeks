class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int element : nums){
            list.add(Integer.toString(element));
        }
        Collections.sort(list, (a,b) -> compare(a,b));
        String result = String.join("", list);
        if(allZeros(result)) return "0";
        return result;
    }
    private boolean allZeros(String number){
        for(char c : number.toCharArray()){
            if(c != '0') return false;
        }
        return true;
    }
    private int compare(String a, String b){
        int aIndex = 0;
        int bIndex = 0;
        while(aIndex < a.length() || bIndex < b.length()){
            if(aIndex == a.length()) aIndex = 0;
            if(bIndex == b.length()) bIndex = 0;
            if(a.charAt(aIndex) > b.charAt(bIndex)) return -1;
            if(b.charAt(bIndex) > a.charAt(aIndex)) return 1;
            aIndex++;
            bIndex++;
        }
        return 0;
    }
}