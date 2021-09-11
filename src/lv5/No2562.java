package lv5;

import java.util.Scanner;

public class No2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		int i, cnt = 0, max = 0;
		
		for(i=0;i<9;i++) {
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
				cnt=i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}

}
