package array1;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {10,4,6,7,2,9,3,1,8,5};
			int n=a.length;
			int temp;
			for(int i=n-1;i>0;i--) {
				
				for(int j=0;j<i;j++) {
					if(a[j]>a[j+1]) {
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				
			
			}	System.out.println(Arrays.toString(a));

	}

}
