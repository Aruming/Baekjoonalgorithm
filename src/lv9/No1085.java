package lv9;

import java.util.Scanner;

public class No1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_min, y_min;
		
		if(x > w-x)
			x_min = w-x;
		else
			x_min = x;
		
		if(y > h-y)
			y_min = h-y;
		else
			y_min = y;
		
		System.out.println(x_min>y_min?y_min:x_min);
	}

}
