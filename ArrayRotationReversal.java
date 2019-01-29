import java.util.Scanner;

/* Array Rotation using Reversal method time complexity O(n) */
/* d + n-d + n ==> 2n ==> O(N) */
public class ArrayRotationReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		
		int arrLen = in.nextInt();
		
		int[] inputArray = new int[arrLen];
		
		System.out.println("Enter the Array rotation: ");
		
		int rotation = in.nextInt();
		
		System.out.println("Enter the Array elements: ");
		
		for(int i=0; i<arrLen; i++) {
			inputArray[i] = in.nextInt();
		}
		in.close();
		
		arrRotation(inputArray,0,rotation-1);
			
		arrRotation(inputArray,rotation,arrLen-1);
			
		arrRotation(inputArray,0,arrLen-1);
		
		
		for(int i=0; i<arrLen; i++) {
			System.out.println(inputArray[i]);
		}
	}
	
	public static void arrRotation(int[] arr, int start, int end) {
		
		for(int i=start,j=end; i<j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
