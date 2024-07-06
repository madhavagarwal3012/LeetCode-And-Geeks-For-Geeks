class Solution {
    public int numberOfChild(int n, int time) {
         while(time > 0){
            int personwithPillow = 1;
            while(personwithPillow < n){
                personwithPillow++;
                time--;
                if(time == 0){
                    return personwithPillow - 1;
                }
            }
            while(personwithPillow > 1){
                personwithPillow--;
                time--;
                if(time == 0){
                    return personwithPillow - 1;
                }
            }
        }
        return 0;
    }
}