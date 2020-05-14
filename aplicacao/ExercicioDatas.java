package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class ExercicioDatas {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			System.out.println("Data sem manipula��o>>: "+new Date());
			
			System.out.println("Data com formata��o>>: "+sdf.format(new Date()));
			
			System.out.println("Data ISO8601 sem formata��o>>: "+new Date().from(Instant.parse("2020-05-10T19:50:44Z")));
			System.out.println("Data ISO8601 com formata��o>>: "+sdf.format(new Date().from(Instant.parse("2020-05-10T19:50:44Z"))));
			
			System.out.println("Definindo TimeZone");
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println("Data ISO8601 com formata��o>>: "+sdf.format(new Date().from(Instant.parse("2020-05-10T19:50:44Z"))));
			
			System.out.println("Uso Calendar - manipula��o de datas");
			Date y = new Date().from(Instant.parse("2020-05-10T21:10:00Z"));
			Calendar cal = Calendar.getInstance();
			cal.setTime(y);
			cal.add(Calendar.HOUR_OF_DAY, 2);
			y = cal.getTime();
			System.out.println(sdf.format(y));
		}
		catch(ParseException e) {
			System.out.println("Formato inv�lido"+e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
