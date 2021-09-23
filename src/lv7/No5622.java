package lv7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No5622 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String word = br.readLine();
		
		int t = 0;
		for(int i=0;i<word.length();i++) {
			int alpha = word.charAt(i)-65;
			if(0<=alpha && alpha<=2) {
				t += 3;
			}
			if(3<=alpha && alpha<=5) {
				t += 4;
			}
			if(6<=alpha && alpha<=8) {
				t += 5;
			}
			if(9<=alpha && alpha<=11) {
				t += 6;
			}
			if(12<=alpha && alpha<=14) {
				t += 7;
			}
			if(15<=alpha && alpha<=18) {
				t += 8;
			}
			if(19<=alpha && alpha<=21) {
				t += 9;
			}
			if(22<=alpha && alpha<=25) {
				t += 10;
			}
		}
		
		System.out.println(t);
				
	}

}
