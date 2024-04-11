
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
			int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            int A = P*W;
            int B = 0;
            if(R >= W) {
            	B = Q;
            }
			else {
            	B = Q + S*(W-R);
            }
            if (A>B) { 
            	System.out.println("#" + test_case + " " + B);
            }
            else {
            	System.out.println("#" + test_case + " " + A);
            }
		}
	}
}