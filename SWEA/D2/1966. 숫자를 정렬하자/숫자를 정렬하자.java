import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = sc.nextInt();
            int [] arr = new int [num];
            for(int i = 0; i < num; i++) {
            	arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("#" + test_case);
            for(int i =0; i < num; i++) {
            	System.out.printf(" " + arr[i]);
            }
            System.out.println();
		}
	}
}