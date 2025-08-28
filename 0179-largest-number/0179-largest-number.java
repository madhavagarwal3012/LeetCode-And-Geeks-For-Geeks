class Solution {
    public String largestNumber(int[] nums) {
        String[] elements = new String[nums.length];
        int index = 0;
        for(int element : nums){
            elements[index++] = Integer.toString(element);
        }
        Arrays.sort(elements, new Comparator<String>(){
            public int compare(String a, String b){
                String first = a + b;
                String second = b + a;
                return second.compareTo(first);
            }
        });
        if(elements[0].equals("0")){
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for(String element : elements){
            largestNumber.append(element);
        }
        return largestNumber.toString();
    }
}