package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Reserva;
import entidades.exceptions.DomainException;

public class ExercicioReservaHotelExceptions {
	

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Nº quarto: ");
			int nroQuarto = sc.nextInt();
			System.out.print("Data check-in (dd/mm/yyyy) >>: ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Data check-out (dd/mm/yyyy) >>: ");
			Date checkout = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(nroQuarto, checkin, checkout);
			System.out.println(reserva);
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva");
			System.out.print("Data check-in (dd/mm/yyyy) >>: ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data check-out (dd/mm/yyyy) >>: ");
			checkout = sdf.parse(sc.next());
		
			reserva.updateDatas(checkin, checkout);
			
			System.out.println(reserva);
		}
		catch(ParseException e) {
			System.out.println("Formato de data inválido");
		}
		catch(DomainException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			
			sc.close();
		}
	}

}
