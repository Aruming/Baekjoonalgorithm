package lv7;

import java.util.Scanner;

public class No1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int alpha[] = new int[26];
		
		for(int i=0;i<word.length();i++) {
			int asc = word.charAt(i);
			if(asc<97) {
				alpha[asc-65]++;
			}else {
				alpha[asc-97]++;
			}
		}
		int maxindex=0, max=0;
		for(int i=0;i<26;i++) {
			if(max<alpha[i]) {
				max = alpha[i];
				maxindex=i;
			}
		}
		
		int cnt=0;
		for(int i=0;i<26;i++) {
			if(alpha[i]==max) {
				cnt++;
			}
		}
		
		if(cnt>1) {
			System.out.println("?");
		}else {
			System.out.println((char)(maxindex+65));
		}
	}

}
