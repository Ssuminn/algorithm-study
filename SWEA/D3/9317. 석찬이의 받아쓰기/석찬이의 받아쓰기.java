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
			int length = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int num = 0;
            
            for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(i))
					num++;
			}
			System.out.println("#" + test_case + " " + num);
		}
	}
}