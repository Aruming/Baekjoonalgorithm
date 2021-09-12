package lv5;

import java.util.Scanner;

public class No3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, cnt=0;
		int num[] = new int[10];
		int a[] = new int[42];
		
		for(i=0;i<10;i++) {
			num[i] = sc.nextInt();
			a[num[i]%42]++;
		}
		
		for(i=0;i<42;i++) {
			if(a[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
