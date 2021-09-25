package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1712 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num[] = br.readLine().split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		
		if(b>c) {
			System.out.println("-1");
		}else {
			int n = a/(c-b);
			System.out.println(n);
		}
		
	}

}
