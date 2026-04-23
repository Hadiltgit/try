package ttry;

public class Try {
	
	int result = 0;

	public String game() {
		result +=1;
		if(result == 3) {
			return "fizz";
		}
		return String.format("%d", result);
	}

}
