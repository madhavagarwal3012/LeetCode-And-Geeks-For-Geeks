class Solution {
    public int numberOfChild(int n, int time) {
         while(time > 0){
            int childwithBall = 1;
            while(childwithBall < n){
                childwithBall++;
                time--;
                if(time == 0){
                    return childwithBall - 1;
                }
            }
            while(childwithBall > 1){
                childwithBall--;
                time--;
                if(time == 0){
                    return childwithBall - 1;
                }
            }
        }
        return 0;
    }
}