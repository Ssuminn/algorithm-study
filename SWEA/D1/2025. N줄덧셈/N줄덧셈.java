
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
	
		for(int i = 1; i <= T; i++)
		{
			sum += i;
		}
		System.out.printf("%d", sum);
	}
}