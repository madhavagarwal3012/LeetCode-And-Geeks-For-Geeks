class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> check = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;

        for(int index = 0; index < candies.length; index++){
            if(candies[index] > maximum){
                maximum = candies[index];
            }
        }
        for(int index = 0; index < candies.length; index++){
            if(candies[index] + extraCandies >= maximum){
                check.add(true);
            }
            else{
                check.add(false);
            }
        }
        return check;
    }
}