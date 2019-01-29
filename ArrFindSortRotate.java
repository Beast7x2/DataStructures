import java.util.Scanner;

/* Search an element in a sorted and rotated array */
/* since this is using binary search tree the complexity is O(logn) */
public class ArrFindSortRotate {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		
		int arrLen = in.nextInt();
		
		int[] inputArray = new int[arrLen];
		System.out.println("Enter the array elements: ");
		
		for(int i=0; i<arrLen; i++){
			inputArray[i] = in.nextInt();
		}
		
		System.out.println("Enter the element to find:  ");
		int findElement = in.nextInt();
		in.close();
		int position = searchIndex(inputArray,0,arrLen-1,findElement);
		
		System.out.println("Element's position: "+ position);
	}
	
	public static int searchIndex(int[] arr, int start, int end, int findValue){
		
		if(start > end)
			return -1;
		if(start == end)
			return start;
		
		int mid = (start + end) / 2;
		
		if(arr[mid] == findValue)
			return mid;
		
		if(arr[start] <= arr[mid]){
			
			if(arr[mid] >= findValue && arr[start] <= findValue)
				return searchIndex(arr, start, mid-1, findValue);
			return searchIndex(arr, mid+1, end , findValue);
		}
		
		
		if(arr[mid] <= findValue && arr[end] >= findValue)
			return searchIndex(arr, mid+1, end, findValue);
			
		return searchIndex(arr, start, mid-1 , findValue);
		
		
	}

}
