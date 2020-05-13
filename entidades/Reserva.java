package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//static informa q somente sera gerado um objeto sdf
	private Integer nrQuarto;
	private Date checkin;
	private Date checkout;
	//Construtor
	public Reserva(Integer nrQuarto, Date checkin, Date checkout) {
		this.nrQuarto = nrQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	//Getters and Setters
	public Integer getNrQuarto() {
		return nrQuarto;
	}
	public void setNrQuarto(Integer nrQuarto) {
		this.nrQuarto = nrQuarto;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	//Outros
	public long duration() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	public String updateDatas(Date checkin, Date checkout) {
		Date dtAtual = new Date();
		
		if(!checkin.after(dtAtual) && !checkout.after(checkout)) {
			return "Erro na reserva: As datas de alteração da reserva devem ser posteriores a data atual";
		}
		if(!checkout.after(checkin)) {
			return "Erro na reserva: A Data checkout deve ser posterior a data checkin";
		}
		this.checkin = checkin;
		this.checkout = checkout;
		return null;
	}
	@Override
	public String toString() {
		return "Quarto "
				+nrQuarto
				+", check-in: "
				+sdf.format(checkin)
				+", check-out: "
				+sdf.format(checkout)
				+", "
				+duration()
				+" noites";
	}
}
