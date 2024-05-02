import java.util.Scanner;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int a[] = new int[N];
            int b[] = new int[M];
            int max = 0;
            int sum;
 
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
 
            for (int i = 0; i < M; i++) {
                b[i] = sc.nextInt();
            }
 
            if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += a[j + i] * b[j];
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
 
            else {
                for (int i = 0; i < M - N + 1; i++) {
                    sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum += a[j] * b[j + i];
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
 
 
            System.out.println("#" + test_case + " " + max);
        }
    }
}