package Case3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Array {

	public static void main(String[] args) {
//		 · 数组A：“1，7，9，11，13，15“；
//		 · 数组b：“2，4，6，8，10” 
//		两个数组合并为数组C 
		int A[]= {1,7,9,11,13,15}; 
	    int B[]= {2,4,6,8,10};  
	    int length = A.length+B.length; 
		int[] C = new int[length];
		double sum=0;
		double avg=0;
		System.arraycopy(A, 0, C, 0, A.length); 
		System.arraycopy(B, 0, C,A.length, B.length);
		//2.求该数组的数据之和和平均数
		System.out.println("合并数组");
		for(int i=0;i<C.length;i++) {
			System.out.println(C[i]);
				sum=sum+C[i];
			}
			avg=sum/C.length;
			System.out.println("数组总和是"+sum);
			System.out.println("平均数是"+avg);
	}		
}
