import java.util.Scanner;

public class ArrRotationGCDjug {

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
		
		int GCD = findGCD(arrLen,rotation);
	
		
		for(int i=0; i<GCD; i++){
			
			int j= i;
			int temp = inputArray[i];
			while(true){
				int k = j + rotation;
				
				if(k >= arrLen)
					k = k - arrLen;
				if(k == i)
					break;
				
				inputArray[j] = inputArray[k];
				j = k;
			}
			
			inputArray[j] = temp;
		}
		
		
		for(int i=0; i<arrLen; i++){
			System.out.println(inputArray[i]);
		}
		
	}
	
	public static int findGCD(int num1, int num2){
		int gcdfind;
		
		if(num1 > num2)
			gcdfind = num2;
		else 
			gcdfind = num1;
		
		for(int i=gcdfind; i>0; i--){
			if(num1%i == 0 && num2%i == 0)
				return i;
		}
		return 1;
	}

}
