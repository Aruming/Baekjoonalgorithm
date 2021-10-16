package lv9;

import java.util.Scanner;

public class No4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a+b+c==0)
				break;
			
			int hypo, sum;
			if(a>b) {
				if(a>c) {
					hypo=a;
					sum = b*b + c*c;
				}
				else {
					hypo=c;
					sum = a*a + b*b;
				}
			}else {
				if(b>c) {
					hypo=b;
					sum = a*a + c*c;
				}
				else {
					hypo=c;
					sum = a*a + b*b;
				}
			}
			
			if(hypo*hypo == sum)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}

}
