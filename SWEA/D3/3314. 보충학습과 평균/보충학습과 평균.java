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
            int [] score = new int [5];
            int sum = 0;
            int avg = 0;
			for(int i =0; i < 5; i++) {
            	score[i] = sc.nextInt();
                if(score[i]<40) score[i] = 40;
                
                sum += score[i];
            }
            avg = sum/5;
            
            System.out.println("#" + test_case + " " + avg);
		}
	}
}