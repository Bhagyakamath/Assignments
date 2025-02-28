
public class ArraySortEvenOdd {
	public static void main(String args[]) {
		int a[]= {11,40,38,59,22,67};
		int left=0, right=a.length-1;
		while(left<right) {
			while(left<right && a[left]%2==0) {
				left++;
			}
			while(left<right && a[right]%2!=0) {
				right--;
			}
			if(left<right) {
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
