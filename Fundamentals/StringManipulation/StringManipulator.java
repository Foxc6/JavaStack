public class StringManipulator{
	public String trimAndConcat(String stringOne, String stringTwo){
		return stringOne.replaceAll("\\s+","") + stringTwo.replaceAll("\\s+","");
	}

	public Integer getIndexOrNull(String stringOne, char stringTwo){
		if((stringOne.indexOf(stringTwo)) == -1){
			return null;
		}else{
			return stringOne.indexOf(stringTwo);
		}
	}

	public Integer getIndexOrNull(String stringOne, String stringTwo){
		if((stringOne.indexOf(stringTwo)) == -1){
			return null;
		}else{
			return stringOne.indexOf(stringTwo);
		}
	}

	public String concatSubstring(String stringOne, int numOne, int numTwo, String stringTwo){
		return (stringOne.substring(numOne,numTwo)) + (stringTwo);
	}
}