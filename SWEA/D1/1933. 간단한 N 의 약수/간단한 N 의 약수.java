import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;


class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
		
		for(int i = 1; i <= T; i++) { 
        	if(T%i==0){
            	divisors.add(i);
            }
        }

        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
	}
}