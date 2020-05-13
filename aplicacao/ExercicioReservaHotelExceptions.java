package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Reserva;

public class ExercicioReservaHotelExceptions {
	

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nº quarto: ");
		int nroQuarto = sc.nextInt();
		System.out.print("Data check-in (dd/mm/yyyy) >>: ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Data check-out (dd/mm/yyyy) >>: ");
		Date checkout = sdf.parse(sc.next());
		if(!checkout.after(checkin)) {
			System.out.println("Erro na reserva: A Data checkout deve ser posterior a data checkin");
		}else {
			Reserva reserva = new Reserva(nroQuarto, checkin, checkout);
			System.out.println(reserva);
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva");
			System.out.print("Data check-in (dd/mm/yyyy) >>: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data check-out (dd/mm/yyyy) >>: ");
			checkout = sdf.parse(sc.next());
		
			String erro = reserva.updateDatas(checkin, checkout);
			if(erro != null) {
				System.out.println(erro);
			}else {
				System.out.println(reserva);
			}
			
		sc.close();
			
			
		}
		
		
		
	}

}
