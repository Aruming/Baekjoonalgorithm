package lv3;

import java.util.Scanner;

public class No11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, x, i;
		x = sc.nextInt();
		
		for(i=1;i<=x;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a+b;
			
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
		}
		sc.close();
	}

}
