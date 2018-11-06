
public class HasCard implements State{
	
	private AtmMachine maichine;
	
	public HasCard(AtmMachine atmMachine) {
		
		this.maichine=atmMachine;
		
	}

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println( "There is already a card inserted");
	}

	public void ejectCard() {
		
		maichine.setState(maichine.noCard);
		
		System.out.println( "card ejected sucessfully");
	}

	public void enterPin(int pin) {
		
		if(pin==123) {
			
			this.maichine.setState(maichine.hasPin);
			
			System.out.println( "pin entered sucessfully");
			
		}else {
			
			System.out.println( "wrong pin");
			
		}
	
	}

	public void requestCash(int cash) {
		
		System.out.println( "Please enter the pin first");
			
	}

}
