package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1712 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num[] = br.readLine().split(" ");  //공백을 기준으로 나누어 배열 저장
		int a = Integer.parseInt(num[0]);  //문자 정수화
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		
		if(b>=c) {  //손익분기점 없을 때
			System.out.println("-1");
		}else {
			int n = a/(c-b);
			System.out.println(n+1);
		}
		
	}

}
