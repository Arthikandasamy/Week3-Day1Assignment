
public class AxisBank extends BankInfo 
{
@Override
	public void deposit() {
	System.out.println("Get deposit amount");
	}

	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
	}

}
