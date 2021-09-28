package lv8;

import java.util.Scanner;

public class No2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, v;
		a = sc.nextInt();
		b = sc.nextInt();
		v = sc.nextInt();
		
		int day = 0;
		while(v>0){
			day++;
			v -= a;
			if(v==0) break;
			else v += b;
			
		}
		
		System.out.println(day);
	}

}
