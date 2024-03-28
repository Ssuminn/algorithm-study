class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; // 1월 1일은 금요일
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1~12월 의 일수
        int date = 0; // 총 일수
        
        for(int i = 0; i < a - 1; i++) { 
            date += months[i]; // a월전까지의 총일수 구하기
        }
        date += b - 1; // b의 일수 만큼 더 더해주기

        return days[(date) % 7];
    }
}
