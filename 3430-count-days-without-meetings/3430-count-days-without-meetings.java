class Solution {
    public int countDays(int days, int[][] meetings) {
        int countD = 0;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int day = 1;            int row = 0;
        while(row < meetings.length){
            if (day < meetings[row][0]) { 
                countD += meetings[row][0] - day;
                day = meetings[row][0] + 1;
            }
            else if(day >= meetings[row][0]){
                if(day <= meetings[row][1] || meetings[row][1] > day){
                    day = meetings[row][1] + 1;
                }
                row++;
            }
            else if(day > meetings[row][1]){
                row++;
            }
            else{
                break;
            }
        }
        if(row == meetings.length && day <= days && day > 1){
            while(day <= days){
                countD += days - day + 1;
                day = days + 1;
            }
        }
        return countD;
    }
}