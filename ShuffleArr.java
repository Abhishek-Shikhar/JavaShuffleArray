package fog;
import java.util.Random;
import java.util.Arrays;

//Java Program to shuffle a given array

public class ShuffleArr {
	
		// this function to generate a random permutation of arr[]
		static void randomize( int arr[], int n)
		{
			Random r = new Random();
			
			// start from the last element and swap one by one. We don't
			// need to run for the first element that's why i > 0
			for (int i = n-1; i > 0; i--) {
				int j = r.nextInt(i+1);
				
				// swap arr[i] with the element at random index
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		public static void main(String[] args) 
		{
			int[] arr = {1, 2, 3, 4, 5, 6, 7};
			int n = arr.length;
			randomize (arr, n);
		}
	}
	


