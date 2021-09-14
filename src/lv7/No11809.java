package lv7;

import java.util.Arrays;
import java.util.Scanner;

public class No11809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();  
		int alpha[] = new int[26];
		Arrays.fill(alpha, -1);
		
		for(int i=0;i<s.length();i++) {
			if(alpha[s.charAt(i)-97]==-1) {
				alpha[s.charAt(i)-97]=i;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(alpha[i]+" ");
		}
		

	}

}
