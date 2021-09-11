package lv5;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i, multi = a*b*c;
		
		int num[] = new int[10];
		while(multi>0) {
			num[multi%10]++;
			multi = multi/10;
		}
		
		for(i=0;i<10;i++) {
			System.out.println(num[i]);
		}

	}

}
