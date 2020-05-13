package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExercicioFileScaner {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in1.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não localizado");
		}
		finally {
			//try {
				if(sc != null) {
					sc.close();
				}/*
			}catch(NullPointerException e) {
				System.out.println("Erro"+e.getMessage());
			}*/
		
		}
	}
}
