package mypackage;




public class Contract_Employee extends Employee
{
	private float pay_per_hour;
	private String Contract_Duration;
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_Duration() {
		return Contract_Duration;
	}
	public void setContract_Duration(String contract_Duration) {
		this.Contract_Duration = contract_Duration;
	}
	

}
