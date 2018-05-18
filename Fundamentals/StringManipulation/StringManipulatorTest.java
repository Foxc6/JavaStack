public class StringManipulatorTest{
	public static void main(String[] args){
		// First Class Method
		StringManipulator myTrimAndConcat = new StringManipulator();
		String answerOne = myTrimAndConcat.trimAndConcat("   Hello    ", "    World ");
		System.out.println(answerOne);

		// Second Class Method
		StringManipulator  charGetIndexOrNull = new StringManipulator();
		Integer answerTwo = charGetIndexOrNull.getIndexOrNull("Hello World", 'o');
		System.out.println(answerTwo);

		// Third Class Method
		StringManipulator  stringGetIndexOrNull = new StringManipulator();
		Integer answerThree = stringGetIndexOrNull.getIndexOrNull("Hello World", "x");
		System.out.println(answerThree);

		StringManipulator manipulator = new StringManipulator();
		String word = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(word);
	}
}