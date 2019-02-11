import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/* Rearrange an array such that arr[i] = i 
 * Time complexity O(n)
 */
public class ArrRearrangeArri {

	public static void main(String args[]){
		
		System.out.println("Enter the input size: ");
		
		Scanner in = new Scanner(System.in);
		int arrLen = in.nextInt();
		
		int[] inputArray = new int[arrLen];
				
		System.out.println("Enter the Array elements: ");
		for(int i=0; i<arrLen; i++){
			inputArray[i] = in.nextInt();
		}
		
		in.close();
		
		HashSet<Integer> numset = new HashSet<Integer>();
		
		for(int i=0; i<arrLen; i++){
			numset.add(inputArray[i]);
		}
		
		for(int i=0; i<arrLen; i++){
		
			if(numset.contains(i))
				inputArray[i] = i;
			else
				inputArray[i] = -1;
		}
		
		Arrays.stream(inputArray).forEach(s -> System.out.println(s));
	}
}
