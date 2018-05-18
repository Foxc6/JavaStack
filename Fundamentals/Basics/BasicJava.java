import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{
	public static void main(String[] args){
	
		BasicJava myTest = new BasicJava();

		// Test Method
		String testOne = myTest.testMethod();
		System.out.println(testOne);

		// 1-255 Method
		myTest.getTwoFiftyFive();

		// Odd 1-255 Method
		myTest.getOddTwoFiftyFive();

		// Sum 1-255 Method
		myTest.getSumTwoFiftyFive();

		// Iterate Array Method
		myTest.iterateArray();

		// Find Max Method
		double[] maxArray = {10,4,56,20,12};
		double myMax = myTest.findMax(maxArray);
		System.out.println(myMax);

		// Find Average Method
		double[] averageArray = {10,4,56,20,12};
		double myAverage = myTest.getAverage(averageArray);
		System.out.println(myAverage);

		// Array with Odd Numbers
		ArrayList<Integer> myOddArray = myTest.getOddArray();
		System.out.println(myOddArray);

		// Greater than Y Method
		double[] myGTYArray = {5,7,2,8,4,2,6,8,3,2,5,7,5,3,2,4,6,7};
		int myY = 4;
		int gTYResult = myTest.getGreaterThanY(myGTYArray, myY);
		System.out.println(gTYResult);

		// Squared Values Method
		int[] myNotSquaredArray = {1,2,3,4,5,6,7,8,9};
		int[] mySquaredArray = myTest.squaredValues(myNotSquaredArray);
		System.out.println(Arrays.toString(mySquaredArray));

		// Eliminate Negative Numbers Method
		int[] arrayWithNegatives = {1,-2,3,4,5,-6,7,8,-9};
		int[] arrayWithoutNegatives = myTest.removeNegatives(arrayWithNegatives);
		System.out.println(Arrays.toString(arrayWithoutNegatives));

		// Min Max Average Method
		int[] minMaxAvgArr = {1,2,3,4,5};
		int[] finalArr = minMaxAvg(minMaxAvgArr);
		System.out.println(Arrays.toString(finalArr));

		//Shift values in an Array Method
		int[] initialArray = {1,2,3,4,5};
		int[] finalArray = shiftValues(initialArray);
		System.out.println(Arrays.toString(finalArray));

		// int[] initialArray = {1,2,3,4,5};
		// initialArray[0] = initialArray[1];
		// System.out.println(Arrays.toString(initialArray));



	}

	// Test Method
	public String testMethod(){
		return "This is a test and only a test";
	}

	// 1-255 Method
	public static void getTwoFiftyFive(){
		for(int i=0; i<255; i++){
			System.out.println(i + 1);
		}
	}

	// Odd 1-255 Method
	public static void getOddTwoFiftyFive(){
		for(int i=0; i<255; i++){
			if((i+1) % 2 != 0)
			System.out.println(i + 1);
		}
	}

	// Get Sum 1-255 Method
	public static void getSumTwoFiftyFive(){
		int count = 0;
		for(int i=0; i<255; i++){
			count = count + i;
			System.out.println("New Number: " + i + " Count: " + count);
		}
	}

	// Iterate Array Method
	public static void iterateArray(){
		int[] myArray = {4, 8, 8, 5, 9};
		for(int i=0; i<myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}

	// Find Max Method
	public double findMax(double[] arr){
		double max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	// Get Average
	public double getAverage(double[] arr){
		double total = 0;
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
		double average = (total / arr.length);
		return average;
	}

	// Array with Odd Numbers
	public ArrayList<Integer> getOddArray(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<255; i++){
			if((i+1) % 2 != 0){
				arr.add(i+1);
			}
		}
		return arr;
	}

	// Greater than Y Method
	public int getGreaterThanY(double[] arr, int y){
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] > y){
				count++;
			}
		}

		return count;
	}

	// Square Values Method
	public int[] squaredValues(int[] arr){
		for(int i=0; i<arr.length; i++){
			arr[i] = (arr[i] * arr[i]);
			System.out.println(arr[i]);
		}
		return arr;
	}

	// Eliminate Negative Numbers Method
	public int[] removeNegatives(int[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr[i] < 0){
				arr[i] = 0;
			}
		}
		return arr;
	}

	//Min Max Average Method
	public static int[] minMaxAvg(int[] arr){
		int max = arr[0];
		int min = arr[0];
		int total = 0;
		for(int i=0; i<arr.length; i++){
			total += arr[i];
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int avg = (total / arr.length);
		int[] finalArr;
		finalArr = new int[3];
		finalArr[0] = max;
		finalArr[1] = min;
		finalArr[2] = avg;

		return finalArr;

	}

	// Shifting Values in an Array Method
	public static int[] shiftValues(int[] arr){
		for(int i=0; i<arr.length; i++){
			int temp = i + 1;
			if(temp < arr.length){
				arr[i] = arr[temp];
			}
			if(temp >= arr.length){
				arr[i] = 0;
			}
			temp++;
		}

		return arr;
	}


	

}