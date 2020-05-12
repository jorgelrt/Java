package entidades;

public class OutsourceEmployee extends Employee {
	
	private Double additionalCharge;
	
	//Construtor
	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double payment() {
		Double salary = super.payment();
		return salary += additionalCharge*1.10;
	}
}
