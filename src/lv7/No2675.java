package lv7;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int r;
		String s="";
		
		for(int i=0;i<t;i++) {
			r = sc.nextInt();
			s = sc.next();
			
			for(int j=0;j<s.length();j++) {
				char a = s.charAt(j);
				for(int k=0;k<r;k++) {
					System.out.print(a);
				}
			}
			System.out.println("");
		}
	}

}
