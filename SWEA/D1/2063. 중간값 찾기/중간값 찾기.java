import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] arr = new int[T]; // 입력받은 크기로 배열 생성
        for(int test_case = 0; test_case < T; test_case++) {
            // 정수 입력 받기
            arr[test_case] = sc.nextInt();
        }
        // 배열 정렬
        Arrays.sort(arr);

        // 중앙값 계산
        int center = arr[T / 2]; // 중앙에 위치한 값

        // 중앙값 출력
        System.out.println(center);
    }
}
