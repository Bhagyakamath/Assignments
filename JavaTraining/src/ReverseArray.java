import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {10,40,38,59,22,67};
		int left=0, right=a.length-1;
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("Min: "+a[0]);
		System.out.println("Max: "+a[a.length-1]);
		

	}

}
