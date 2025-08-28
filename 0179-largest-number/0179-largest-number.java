class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int element : nums){
            list.add(Integer.toString(element));
        }
        Collections.sort(list, (a,b) -> compare(a,b));
        String result = String.join("", list);
        if(result.length() > 0 && result.charAt(0) == '0'){
            return "0";
        }
        return result;
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