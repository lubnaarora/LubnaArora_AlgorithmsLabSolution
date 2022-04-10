import java.util.*;
import java.lang.*;

public class MinimumNumberOfCurrencyNotes {

	static int available_denominations, currency_notes[];
	
	public static void swap(int i,int j)
	{
		int temp;
		temp = currency_notes[i];
		currency_notes[i] = currency_notes[j];
		currency_notes[j] = temp;
	}
	
	public static void bubbleSort(int n)
	{
		int numSorted = 0;
		int index;
		
		while(numSorted < n)
		{
			for(index = 1; index < n-numSorted;index++)
			{
				if(currency_notes[index-1] < currency_notes[index])
					swap(index-1,index);
			}
			numSorted++;
		}
	}
	
	public static void CalculateCurrency(int amount)
	{
		int[] currency_counter = new int[currency_notes.length];
		
		for(int i=0;i<currency_notes.length;i++) {
			if(amount >= currency_notes[i]) {
				currency_counter[i] = amount / currency_notes[i];
				amount = amount - currency_counter[i] * currency_notes[i];
			}
		}
		
		for(int i=0;i<currency_notes.length;i++) {
			if(currency_counter[i] != 0) {
				System.out.println(currency_notes[i] + ": " + currency_counter[i] );
			}
		}
		
	}
	
	public static void printValues()
	{
		for(int i=0;i<currency_notes.length;i++)
			System.out.println(currency_notes[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of currency denominations");
		Scanner in = new Scanner(System.in);
		available_denominations = in.nextInt();
		
		currency_notes = new int[available_denominations];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<available_denominations;i++)
		{
			int temp  = in.nextInt();
			currency_notes[i] = temp;			
		}

		bubbleSort(currency_notes.length);
		//printValues();
		
		System.out.println("Enter the amount to pay");
		int amount = in.nextInt();
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		CalculateCurrency(amount);
	}

}
