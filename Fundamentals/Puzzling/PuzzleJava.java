import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava{
	public static void main(String[] args){
		PuzzleJava pJ = new PuzzleJava();

		// Puzzle 1
		int[] arrayOne = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> greaterThanTenArr = pJ.getGreaterThanTen(arrayOne);
		System.out.println(greaterThanTenArr);

		// Puzzle 2
		String[] arrayTwo = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(shuffleNames(arrayTwo));
	}

		// Puzzle 1
		public ArrayList<Integer> getGreaterThanTen(int[] arr){
			ArrayList<Integer> newArr = new ArrayList<Integer>();
			for(int i=0; i<arr.length; i++){
				if(arr[i] > 10){
					newArr.add(arr[i]);
				}
			}
			System.out.println(Arrays.toString(arr));
			return newArr;
		}

		// Puzzle 2
		public static ArrayList<String> shuffleNames(String[] arr){
			int index; 
			String temp;
		    Random random = new Random();
		    for (int i = arr.length - 1; i > 0; i--){
		        index = random.nextInt(i + 1);
		        temp = arr[index];
		        arr[index] = arr[i];
		        arr[i] = temp;
		    }
		    System.out.println(Arrays.toString(arr));
			ArrayList<String> newArray = new ArrayList<String>();
			for(int i=0; i<arr.length; i++){
				if(arr[i].length() > 5){
					newArray.add(arr[i]);
				}
			}
			return newArray;
		}

}