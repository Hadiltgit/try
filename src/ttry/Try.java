package ttry;

public class Try {
	
	int result = 0;

	String[] magicValues = {"3","5"};
	String[] magicKeys = {"fizz","buzz"};
	
	public String game() {
		result +=1;
		
		String resul = String.format("%d", result);
		
		for(int i = 0 ; i < magicValues.length ; i++) {
			
			if(    resul.equals( magicValues[i])    ) {
				return magicKeys[i];
			}
		}
		
		return resul;
	}

}
