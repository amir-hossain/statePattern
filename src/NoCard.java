
public class NoCard implements State{
	
	private AtmMachine atmMachine;
	
	

	public NoCard(AtmMachine atmMachine) {

		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		
		atmMachine.setState(atmMachine.hasCard);
		
		System.out.println( "Card inserted sucessfully");
	}

	@Override
	public void ejectCard() {
		
		System.out.println( "There is no card inside");
	}

	@Override
	public void enterPin(int pin) {
		
		System.out.println( "There is no card inside");
	}

	@Override
	public void requestCash(int cash) {
		
		System.out.println( "There is no card inside");
	}

}
