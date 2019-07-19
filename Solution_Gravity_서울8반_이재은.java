package array1;

import java.util.Random;
import java.util.Scanner;
//7,4,2,0,0,6,0,7,0
public class Solution_Gravity_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max=0;
		int N=sc.nextInt();
		int[] box= new int[N];
	
		for(int i=0;i<N;i++) box[i]=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int cnt=0;
			for(int j=i+1;j<N;j++) {
				if(box[i]>box[j])
					cnt++;
			}
			if(cnt>max)max=cnt;
			else continue;
		}
		System.out.println(max);
	}
}