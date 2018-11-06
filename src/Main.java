
public class Main {

	public static void main(String[] args) {
	
		AtmMachine atmMachine=new AtmMachine();
		
		atmMachine.insertCard();
		
		atmMachine.requestCash(123);
		
		atmMachine.enterPin(123);
		
		atmMachine.requestCash(123);
		
		atmMachine.ejectCard();
		
		atmMachine.requestCash(123);
		
		atmMachine.insertCard();
		
		atmMachine.enterPin(1234);
		
		atmMachine.enterPin(123);
		
		atmMachine.requestCash(3000);

	}

}
