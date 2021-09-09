package lv3;

import java.util.Scanner;

public class No11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, A, B, i;
		x = sc.nextInt();
		
		for(i=1;i<=x;i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #"+i+" : "+(A+B));			
		}
		
		sc.close();
	}

}