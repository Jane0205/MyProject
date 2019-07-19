package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		
//		int tc=sc.nextInt();
//		sc.nextLine();
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		
//		System.out.println(tc+":"+s1+","+s2);

		int a[]= {1,2,3,4,5};
		int m=Arrays.stream(a).max().getAsInt();
		System.out.println(m);
	}

}
