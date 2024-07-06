class Solution {
    public int passThePillow(int n, int time) {
        while(time > 0){
            int people = 1;
            while(people < n){
                people++;
                time--;
                if(time == 0){
                    return people;
                }
            }
            while(people > 1){
                people--;
                time--;
                if(time == 0){
                    return people;
                }
            }
        }
        return 0;
    }
}