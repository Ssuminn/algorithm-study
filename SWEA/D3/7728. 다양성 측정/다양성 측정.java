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
			String s = sc.next();
			int[] a = new int[10];
			for(int i = 0; i < s.length(); i++) {
				int tmp = s.charAt(i) - '0';
				a[tmp] = 1;
			}
			int cnt = 0;
			for(int i = 0; i < 10; i++) {
				if(a[i] == 1)
					cnt++;
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}