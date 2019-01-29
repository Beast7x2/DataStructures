import java.util.Scanner;

public class ArrCyclecRotationOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		
		int arrLen = in.nextInt();
		
		int[] inputArray = new int[arrLen];
		System.out.println("Enter the array elements: ");
		
		for(int i=0; i<arrLen; i++){
			inputArray[i] = in.nextInt();
		}
		
		int temp = inputArray[arrLen-1];
		
		for(int i=arrLen-1; i>0; i--){
			inputArray[i] = inputArray[i-1];
		}
		inputArray[0] = temp;
		
		for(int i=0; i<arrLen; i++){
			System.out.println(inputArray[i]);
		}
	}

}
