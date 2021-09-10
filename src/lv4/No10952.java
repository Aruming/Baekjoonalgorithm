package lv4;

import java.util.Scanner;

public class No10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a==0 && b==0) {
				break;
			}else {
				System.out.println(a+b);
			}
		}
	}

}
 