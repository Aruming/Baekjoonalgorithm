package lv7;

import java.util.Scanner;

public class No1152 {
	
	public static void main(String[] args) {
		//charAt() 이용
		Scanner sc = new Scanner(System.in);
		
		String sent = sc.nextLine();
		
		int cnt = 0;
		if(sent.charAt(0)!=' ') {  //첫글자가 공백이 아닐 때
			cnt = 1;    //단어 수 = 공백+1
		}
		for(int i=0;i<sent.length()-1;i++) {
			if(sent.charAt(i)==' ' && sent.charAt(i+1)!=' ') {
				//해당 순서의 문자가 공백이고 그 다음이 공백이 아닐 경우
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
