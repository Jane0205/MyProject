package array1;
import java.awt.RadialGradientPaint;
import java.util.Arrays;
import java.util.Random;
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia= new int[10];
		Random r= new Random();
		int sum=0;	int min=100,max=0;
		
		for(int i=0;i<10;i++) {
			ia[i]=r.nextInt(100);
			if (ia[i]<min)
				min = ia[i];
			if(ia[i]>max)
				max=ia[i];
		} System.out.println(Arrays.toString(ia));
	
		for(int i=0;i<10;i++) {
			sum+=ia[i];
		
		}
		System.out.println(	"sum="+sum+"  min="+min+"  max="+max);
		
	}
	

}
/*
 * sum=min=max=ia[0];
 * 하고 비교해도댐
 */
