
public class HasCard implements State{
	
	private AtmMachine maichine;
	
	public HasCard(AtmMachine atmMachine) {
		
		this.maichine=atmMachine;
		
	}

	public String insertCard() {
		// TODO Auto-generated method stub
		return "There is already a card inserted";
	}

	public String ejectCard() {
		
		maichine.setState(maichine.noCard);
		
		return "card ejected sucessfully";
	}

	public String enterPin(int pin) {
		
		if(pin==123) {
			
			this.maichine.setState(maichine.hasPin);
			
			return "pin entered sucessfully";
			
		}else {
			
			return "wrong pin";
			
		}
	
	}

	public String requestCash(int cash) {
		
		if(cash<=maichine.money) {
			
			maichine.money=maichine.money-cash;
			
			this.maichine.setState(maichine.noCard);
			
			return "you withdraw "+cash+" TK";
			
		}else {
			
			return "insufficient balance";
			
		}
			
	}

}
