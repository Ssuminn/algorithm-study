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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
                
            System.out.print("#" + test_case + " ");
			
            // 나머지 면을 d라 가정
            //정사각형
            if(a==b && b==c) System.out.println(a); // a=b=c이면 정사각형 이므로 d = a,b,c 중 하나 출력하면 됨
            // 직사각형
			if(a==b && b!=c) System.out.println(c); // a=b, c=d 이므로 c 출력
			if(a==c && b!=c) System.out.println(b); // a=c, b=d 이므로 b 출력
			if(b==c && b!=a) System.out.println(a); // b=c, a=d 이므로 a 출력
		}
	}
}