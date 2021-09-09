package lv3;

import java.util.Scanner;

public class No10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, x, i;
		n = sc.nextInt();
		x = sc.nextInt();
		int a[] = new int[n];
		
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
			if(a[i]<x) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
