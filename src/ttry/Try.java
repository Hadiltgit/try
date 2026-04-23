package ttry;

public class Try {
	
	int result = 0;

	String[] magicValues = {"3","5"};
	String[] magicKeys = {"fizz","buzz"};
	
	public String game() {
		result +=1;
		
		
		for(int i = 0 ; i < magicValues.length ; i++) {
			int a = Integer.parseInt(magicValues[i]) ;
			if(   result %   a  == 0    ) {
				return magicKeys[i];
			}
		}
		
		return String.format("%d", result);
	}

}
