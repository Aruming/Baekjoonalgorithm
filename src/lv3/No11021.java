package lv3;

import java.util.Scanner;

public class No11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, a, b, i;
		x = sc.nextInt();
		
		for(i=1;i<=x;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Case #"+i+": "+(a+b));			
		}
		
		sc.close();
	}

}