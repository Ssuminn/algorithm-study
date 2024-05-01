
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
            int cnt = 0;
			int ans = 0;
			boolean[] visited = new boolean[10];
			int n = sc.nextInt();
			int num = 0;
			
			while(cnt < 10) {
				ans += 1;
				num += n;
				String string_num = Integer.toString(num);
				for (int i = 0; i < string_num.length(); i++) {
					int number = Character.getNumericValue(string_num.charAt(i));
					if (!visited[number]) {
						visited[number] = true;
						cnt += 1;
					}
				}
			}
			System.out.println("#" + test_case + " " + num);		
        	}
	}
}
