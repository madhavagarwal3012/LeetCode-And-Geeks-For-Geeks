class Solution {
    public int passThePillow(int n, int time) {
        while(time > 0){
            int personwithPillow = 1;
            while(personwithPillow < n){
                personwithPillow++;
                time--;
                if(time == 0){
                    return personwithPillow;
                }
            }
            while(personwithPillow > 1){
                personwithPillow--;
                time--;
                if(time == 0){
                    return personwithPillow;
                }
            }
        }
        return 0;
    }
}