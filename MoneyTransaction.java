import java.util.Scanner;

public class MoneyTransaction {

	static int InputData[],TargetData[];
	public static int Process(int target) {
		int sum = 0;
		int count = 0;
		
		
		for(int i=0;i<InputData.length;i++) {
			sum += InputData[i];
			count++;
			
			if(sum >= target) {
				return count;
			}
			
		}
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of transaction array" );
		int size = in.nextInt();
		InputData = new int[size];
		
		System.out.println("Enter the values of array ");
		for(int i=0;i<size;i++) {
			int data = in.nextInt();
			InputData[i] = data;
		}
		
		System.out.println("Enter the total no of targets that needs to be acheievd ");
		int target = in.nextInt();
		TargetData = new int[target];
		
		for(int i=0;i<target;i++) {
			System.out.println("Enter the value of target ");
			int data = in.nextInt();
			TargetData[i] = data;
			int result = Process(TargetData[i]);
			if(result > 0)
				System.out.println("Target achieved after "+result+" transaction");
			else
				System.out.println("Given target is not achieved");
		}
		
		
		
	}

}
