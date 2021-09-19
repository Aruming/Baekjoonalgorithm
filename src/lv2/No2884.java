package lv2;

import java.util.Scanner;

public class No2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		}else if(m<45) {
			if(h>=1) {
				System.out.println((h-1)+" "+(60-(45-m)));
			}else if(h==0) {
				System.out.println("23 "+(60-(45-m)));
			}
		}
	}

}
