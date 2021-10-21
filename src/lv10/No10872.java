package lv10;

import java.util.Scanner;

public class No10872 {
	
	static int factorial(int n) {
		int result = 1;
		if(n>1)
			result = n * factorial(n-1);
		else if(n==0)
			result = 1;
		return result;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
	}

}
