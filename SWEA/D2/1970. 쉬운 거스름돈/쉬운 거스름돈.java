
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
            int a = 0; // 50,000
            int b = 0; // 10,000
            int c = 0; // 5,000
            int d = 0; // 1,000
			int e = 0; // 500
            int f = 0; // 100
			int g = 0; // 50
            int h = 0; // 10
			int n = sc.nextInt();
			
            a = n/50000;
			b = (n%50000)/10000;
            c = (n%10000)/5000;
			d = (n%5000)/1000;
			e = (n%1000)/500;
			f = (n%500)/100;
            g = (n%100)/50;
            h = (n%50)/10;
            
            System.out.println("#" + test_case);
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " "+ g + " " + h);
		}
	}
}