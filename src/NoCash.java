
public class NoCash implements State {

	private AtmMachine atmMachine;

	public NoCash(AtmMachine atmMachine) {

		this.atmMachine = atmMachine;

	}

	@Override
	public void insertCard() {

		System.out.println( "no cash");
	}

	@Override
	public void ejectCard() {
		
		atmMachine.setState(atmMachine.noCard);

		System.out.println( "card ejected sucessfully");
	}

	@Override
	public void enterPin(int pin) {
		
		System.out.println( "no cash");
	}

	@Override
	public void requestCash(int cash) {
		
		System.out.println( "no cash");
	}

}
