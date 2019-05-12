
public class puzzle5 {
	
	
	// Change it so that the voltage will exceed the 
	// limit.
	public static void main(String Args[]) {
		int voltage = 100;
		int voltageLimit = 2000;
		if(voltage > voltageLimit) {
			voltage = 2000; 
		} else {
			System.out.println("Voltage level normal");
		}
		
	}
	

}
