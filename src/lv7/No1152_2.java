package lv7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No1152_2 {

	public static void main(String[] args) {
		//StringTokenizer 이용
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		
		//StringTokenizer(분리할문자열, 분리기준) > 분리기준에 따라 나눠 토큰에 저장
		StringTokenizer st = new StringTokenizer(sent, " ");
		System.out.println(st.countTokens()); //저장된 토큰의 개수 반환

	}

}
