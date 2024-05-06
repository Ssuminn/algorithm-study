
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
        int k = sc.nextInt();
        int n = 0;
        
         for (int i = k; i <= p; i++) { // k부터 p까지 반복
            n++; // 반복횟수 세기
            if (i == p) { // 비밀번호일 경우 break;
                break;
            }
        }
        System.out.println(n);
	}
}