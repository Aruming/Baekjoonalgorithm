package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No2869 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, v;
		String[] st = br.readLine().split(" ");
		a = Integer.parseInt(st[0]);
		b = Integer.parseInt(st[1]);
		v = Integer.parseInt(st[2]);
		
		int day=0;
		if((v-a)%(a-b)==0) {
			day = (v-a)/(a-b) + 1;
		}
		else {
			day = (v-a)/(a-b) + 2 ;
		}
		
		System.out.println(day);
	}

}
