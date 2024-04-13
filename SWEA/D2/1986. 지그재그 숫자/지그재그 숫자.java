
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); // 입력된 숫자 N
            int result = 0; // 누적된 값
            for(int j = 1; j <= N; j++) {
                if(j % 2 == 0) { // 짝수인 경우 빼기
                    result -= j;
                } 
                else { // 홀수인 경우 더하기
                    result += j;
                }
            }
			System.out.println("#" + test_case + " " + result);
		}
	}
}