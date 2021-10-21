package lv10;

import java.util.Scanner;

public class No10870 {

	static int fibonacci(int n) {
		int fn = 0;
		if(n>1)
			fn = fibonacci(n-1) + fibonacci(n-2);
		else if(n==1)
			fn = 1;
		else if(n==0)
			fn = 0;
		return fn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}

}
