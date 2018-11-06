
public class AtmMachine {
	
	private State state;
	
	public HasCard hasCard;
	
	public HasPin hasPin;
	
	public NoCard noCard;
	
	public NoCash noCash;
	
	
	public int money=2000;

	public AtmMachine() {
		
		hasCard=new HasCard(this);
		
		hasPin=new HasPin(this);
		
		noCard=new NoCard(this);
		
		noCash=new NoCash(this);
		
		state=noCard;
		
		if(money<1) {
			
			this.state=noCash;
			
		}
		
	}
	
	
	public void setState(State state) {
		
		this.state=state;
		
	}
	
	public void insertCard() {
		
		state.insertCard();
	}
	
	public void ejectCard() {
		
		state.ejectCard();
	}
	
	public void enterPin(int pin) {
		
		state.enterPin(pin);
	}
	
	public void requestCash(int amount) {
		state.requestCash(amount);
	}
	

}
