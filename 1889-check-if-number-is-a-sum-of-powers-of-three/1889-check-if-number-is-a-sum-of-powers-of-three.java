class Solution {
    public boolean checkPowersOfThree(int num) {
        int sum = 0;
        int number = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        while(number < num){
            number = number * 3;
            if(number > num){
                break;
            }
            else{
                list.add(number);
            }
        }
        for(int index = list.size() - 1; index >= 0; index--){
            sum = sum + list.get(index);
            if(sum > num){
                sum = sum - list.get(index);
            }
            else if(sum == num){
                return true;
            }
        }
        return false;
    }
}