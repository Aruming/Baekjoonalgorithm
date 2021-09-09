package lv3;

import java.util.Scanner;

public class No2039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=m-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
