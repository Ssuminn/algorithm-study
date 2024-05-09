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
			int N = sc.nextInt();
            		int[] n = new int [N];
            		int sum = 0;
           		int avg = 0;
           		int count = 0;
			
            		for(int i = 0; i < N; i++) {
                		n[i] = sc.nextInt();
                
                		sum += n[i];
            		}
            		avg = sum/N;
			
            		for(int i = 0; i < N; i++) {
            			if(n[i]<=avg){
                			count++;
                		}
            		}
            	System.out.println("#" + test_case + " " + count);
		}
	}
}
