
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int r = 0; // 이동 거리
            int s = 0; // 속도

            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int cm = sc.nextInt(); // 커맨드
                int a = 0; // 가속도

                if (cm == 1) {
                    a = sc.nextInt();
                } else if (cm == 2) {
                    a = -sc.nextInt();
                }

                s += a; // 현재 속도 갱신
                if (s < 0) s = 0; // 속도가 음수가 되지 않도록 보정
                r += s; // 현재 속도에 따른 이동 거리 갱신
            }
            System.out.println("#" + test_case + " " + r);
        }
    }
}
