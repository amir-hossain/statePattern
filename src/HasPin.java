
public class HasPin implements State{

	@Override
	public String insertCard() {

		return "You can not enter multiple card at once,Please eject previous card";
	}

	@Override
	public String ejectCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String enterPin(int pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String requestCash(int cash) {
		// TODO Auto-generated method stub
		return null;
	}

}
