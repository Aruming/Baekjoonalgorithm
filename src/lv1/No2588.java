package lv1;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = x*y;
		System.out.println(x*(y%10));
		y /= 10;
		System.out.println(x*(y%10));
		y /= 10;
		System.out.println(x*(y%10));
		System.out.println(z);
	}

}
