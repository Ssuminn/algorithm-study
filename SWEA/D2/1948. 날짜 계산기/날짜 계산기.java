import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // 각 월별 일 수를 저장하는 배열
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1~12월의 일수

        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        int T;
        // 테스트 케이스의 수 입력 받기
        T = sc.nextInt();

        // 각 테스트 케이스에 대해 반복
        for(int test_case = 1; test_case <= T; test_case++) {
            // 첫 번째 날짜 입력 받기
            int month1 = sc.nextInt(); 
            int day1 = sc.nextInt(); 
            // 두 번째 날짜 입력 받기
            int month2 = sc.nextInt();
            int day2 = sc.nextInt(); 

            // 총 일 수 계산을 위한 변수 초기화
            int totalDays = 0;

            // 입력받은 두 날짜 사이의 각 달의 일 수 계산
            for (int i = month1; i <= month2; i++) {
                int m = months[i - 1];
                // 첫 번째 달의 경우, 해당 달의 남은 일 수만큼 더해줌
                if (i == month1) {
                    m -= day1-1; // 남은 일 수 계산
                }
                // 마지막 달의 경우, 해당 달의 일 수로 대체
                if (i == month2) {
                    m = day2; // 해당 달의 일 수
                }
                // 총 일 수에 계산된 일 수 더하기
                totalDays += m;
            }

            // 테스트 케이스 번호와 계산된 총 일 수 출력
            System.out.println("#" + test_case + " " + totalDays);
        }
    }
}
