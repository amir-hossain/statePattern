
public class HasPin implements State {

	private AtmMachine atmMachine;

	public HasPin(AtmMachine atmMachine) {

		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {

		System.out.println("You can not enter multiple card at once,Please eject previous card");
	}

	@Override
	public void ejectCard() {

		atmMachine.setState(atmMachine.noCard);

		System.out.println("card ejected sucessfully");
	}

	@Override
	public void enterPin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("You already enter a correnct pin");
	}

	@Override
	public void requestCash(int cash) {
		if (cash<atmMachine.money) {

			atmMachine.money = atmMachine.money - cash;

			System.out.println("Your withdraw amount is " + cash);

			atmMachine.setState(atmMachine.noCard);

			System.out.println("card ejected");

		} else {

			System.out.println("insufficient balance");

			atmMachine.setState(atmMachine.noCard);

			System.out.println("card ejected");
		}

	}

}
