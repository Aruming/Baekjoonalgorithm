package lv5;

import java.util.Scanner;

public class No10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, i, min, max;
		n = sc.nextInt();
		int num[] = new int[n];
		
		for(i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		
		min = num[0];
		max = num[0];
		
		for(i=0;i<n;i++) {
			if(max<num[i]) {
				max = num[i];
			}
			if(min>num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(min+" "+max);
	}

}
