class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        int number = 1;
        
        while(number <= n){
            if(number % 3 == 0 && number % 5 == 0){
                fizzBuzzList.add("FizzBuzz");
            }
            else if(number % 3 == 0){
                fizzBuzzList.add("Fizz");
            }
            else if(number % 5 == 0){
                fizzBuzzList.add("Buzz");
            }
            else{
                fizzBuzzList.add(String.valueOf(number));
            }
            number++;
        }
        return fizzBuzzList;
    }
}