package lv7;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String num = sc.next();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			char num_ = num.charAt(i);
			sum += ((int)num_)-48;
		}
		System.out.println(sum);

	}

}
