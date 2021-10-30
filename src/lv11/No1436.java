package lv11;

import java.util.Scanner;

public class No1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int resultNum = 666;		
		
		int cnt = 1;
		while(cnt!=n) {
			resultNum++;
			String n_ = String.valueOf(resultNum);
			if(n_.contains("666"))
				cnt++;
		}
		
		System.out.println(resultNum);
	}

}
