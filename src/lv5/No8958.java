package lv5;

import java.util.Scanner;

public class No8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();  //테스트케이스 수
		String arr[] = new String[n];  //ox퀴즈 결과 배열
		
		for(int i=0;i<n;i++) {
			int cnt=0;
			int total=0;
			arr[i] = sc.next();
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {  //문자열에 속한 문자 하나씩 분리
					total += ++cnt;
				}else if(arr[i].charAt(j)=='X') {
					cnt=0;
				}
			}
			System.out.println(total);
		}
		
	}

}
