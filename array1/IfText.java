package array1;
import java.util.Random;
import java.util.Scanner;

public class IfText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.print("수=");
		//int T=sc.nextInt();
		Random r= new Random();
		int T=r.nextInt(100)+1;	
		
		if (T%2==0)
			System.out.println(T+" 짝수");
		else 
			System.out.println(T+" 홀수");
		
	}

}
/*
 
 수=10
 짝수
---
수=9
홀수
 */