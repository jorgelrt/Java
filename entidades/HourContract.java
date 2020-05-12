package entidades;

import java.util.Date;

public class HourContract {
	private Date data;
	private Double valuePerHour;
	private Integer hours;
	//Construtor
	public HourContract(Date data, Double valuePerHour, Integer hours) {
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	//Getters and Setters
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	//Outros
	public Double totalValue() {
		return valuePerHour*hours;
	}
}
