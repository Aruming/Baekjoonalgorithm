package lv6;

import java.util.Scanner;

public class No15596 {
	
	long sum(int[] a) {
		long ans = 0;
		
		for(int i=0;i<a.length;i++) {
			ans += a[i];
		}
		
		return ans;
	}

}
