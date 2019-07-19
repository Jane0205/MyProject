package array1;

import java.util.Scanner;

public class Solution_D1_3307_최장증가부분수열_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int min=0;
		int arr[]=new int[N];
		int brr[]=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		
		}if(arr[0]>arr[1])brr[0]=arr[0];
		else brr[1]=arr[1];
		
		for(int i=1;i<=N;i++) {
			if(arr[i]<arr[i+1])brr[i+1]=arr[i+1];
			else brr[1]=arr[1];
			
	
			System.out.println(brr[i]);
		}
		
}
}
