package array1;

import java.util.Arrays;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,4,6,7,2,9,3,1,8,5};
		int cnt[]=new int[10+1];
		int m=Arrays.stream(a).max().getAsInt(); //max구하기
		int c[]=new int[m+1];
		
		for(int i=0;i<a.length-1;i++) {
			c[a[i]]++;
			//System.out.println(Arrays.toString(c));
		}
		for(int j=1;j<c.length;j++) {
			c[j]+=c[j-1];
		}
		for(int i=0;i<a.length;i++) {
			c[a[i]]--;
			cnt[c[a[i]]]=a[i];
		}
				
	}

}
