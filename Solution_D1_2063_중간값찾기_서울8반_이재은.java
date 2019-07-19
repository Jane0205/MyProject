package array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution_D1_2063_중간값찾기_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random r= new Random();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<arr.length;i++) {
			//T=r.nextInt(200)+9;
			
			arr[i]=sc.nextInt();
			//System.out.print(" "+arr[i]);
		}
		Arrays.sort(arr);
		
		System.out.println(arr[(N/2)]);
		sc.close();
	}

}
