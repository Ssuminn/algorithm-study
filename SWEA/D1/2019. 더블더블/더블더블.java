import java.util.Scanner;
import java.io.FileInputStream;
import java.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        for(int i = 0; i <=T; i++) {
        	int n = (int)Math.pow(2,i);
            System.out.print(n + " ");
        }
        
	}
}