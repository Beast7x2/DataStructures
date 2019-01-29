import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Array rotation using temp variable o(d * n) */
public class ArrTempRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input size: ");
		
		Scanner in = new Scanner(System.in);
		int arrLen = in.nextInt();
		
		int[] inputArray = new int[arrLen];
		System.out.println("Enter the rotation size: ");
		int rotation = in.nextInt();
		
		System.out.println("Enter the Array elements: ");
		for(int i=0; i<arrLen; i++){
			inputArray[i] = in.nextInt();
		}
		
		in.close();
		
		for(int i=0; i<rotation; i++){
			int temp = inputArray[0];
			
			for(int j=0; j<arrLen-1; j++){
				inputArray[j] = inputArray[j+1];
			}
			inputArray[arrLen-1] = temp;
		}
		
		for(int i=0; i<arrLen; i++){
			System.out.println(inputArray[i]);
		}
	}

}
