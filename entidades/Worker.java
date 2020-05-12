package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> listaContratos = new ArrayList<HourContract>();
	//Construtor
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	/*
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	*/
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getListaContratos(){
		return listaContratos;
	}
	//Outros
	public void addContract(HourContract contract) {
		listaContratos.add(contract);
	}
	public void remContract(HourContract contract) {
		listaContratos.remove(contract);
	}
	public Double income(Integer mes, Integer ano) {
		Double totalSalary = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract hc : listaContratos) {
			cal.setTime(hc.getData());
			Integer c_mes = 1 + cal.get(Calendar.MONTH);
			Integer c_ano = cal.get(Calendar.YEAR);
			if(c_mes.equals(mes) && c_ano.equals(ano)) {
				totalSalary += hc.totalValue();
			}
		}
		return totalSalary;
	}
}
