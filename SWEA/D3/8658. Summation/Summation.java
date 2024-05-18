import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt(); // 테스트 케이스 수 입력받기

        for (int test_case = 1; test_case <= T; test_case++) {
            int min = Integer.MAX_VALUE; // 최소값을 저장할 변수 초기화 (최대 정수 값으로 초기화)
            int max = Integer.MIN_VALUE; // 최대값을 저장할 변수 초기화 (최소 정수 값으로 초기화)
            int[] arr = new int[10]; // 숫자 10개를 입력받을 배열 생성

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt(); // 10개의 숫자를 배열로 입력 받기
                int sum = 0; // 각 자리수의 합을 저장할 변수 초기화

                int num = arr[i]; // 배열의 숫자를 임시 변수에 저장
                while (num > 0) { // 각 숫자의 자리수를 더하기 위해 반복
                    sum += num % 10; // 현재 자리수(1의 자리)를 더함
                    num /= 10; // 다음 자리수를 위해 숫자를 10으로 나눔
                }

                if (sum > max) max = sum; // 현재 자리수의 합이 최대값보다 크면 최대값 갱신
                if (sum < min) min = sum; // 현재 자리수의 합이 최소값보다 작으면 최소값 갱신
            }
            System.out.println("#" + test_case + " " + max + " " + min); // 결과 출력
        }
    }
}
