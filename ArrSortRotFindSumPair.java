import java.util.Scanner;

public class ArrSortRotFindSumPair {

	/* Given a sorted and rotated array, find if there is a pair with a given sum 
	 *  Time complexity O(N)
	 *  It can be reduced to O(Logn) if we use binarysearch to find pivot point
	 * */
	public static void main(String[] args) {

		System.out.println("Enter the Array size: ");
		
		Scanner in = new Scanner(System.in);
		
		int arrLen = in.nextInt();
		int[] inputArray = new int[arrLen];
		System.out.println("Enter the Array elements: ");
		
		for(int i=0; i<arrLen; i++){
			inputArray[i] = in.nextInt();
		}

		System.out.println("Enter the sum: ");
		int sumValue = in.nextInt();
		
		in.close();
		findPairs(inputArray, arrLen, sumValue);
	}

	public static void findPairs(int[] inputArray, int size, int sum){
		
		// pivot point
		int i=0;
		for(;i<size-1; i++){
			if(inputArray[i] > inputArray[i+1])
				break;
		}
		
		int largestElement = i;
		int smallestElement = (i + 1) % size;
		boolean flag = false;
		
		while(largestElement != smallestElement){
			
			if(inputArray[largestElement] + inputArray[smallestElement] == sum){
				System.out.println("Pairs : " + inputArray[largestElement] + " : "+ inputArray[smallestElement]);
				flag = true;
				
				if(largestElement == ((smallestElement + 1 + size) % size))
					break;
				smallestElement = (smallestElement + 1 + size) % size;
				largestElement  = (largestElement - 1 + size) % size;
			}
			
			else if(inputArray[largestElement] + inputArray[smallestElement] < sum)
				smallestElement = (smallestElement + 1 + size) % size;
			else
				largestElement  = (largestElement - 1 + size) % size;
		}
		
		if(!flag)
			System.out.println("No pairs found for sum: " + sum);
	}
}
