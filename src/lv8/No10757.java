package lv8;

import java.math.BigInteger;
import java.util.Scanner;

public class No10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		a = a.add(b);
		System.out.println(a.toString());
	}

}
