package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoProduto;
import entidades.Produto2;
import entidades.enums.StatusPagamento;

public class ExercicioComposicao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do cliente");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Nasc.: ");
		Date nasc = sdf.parse(sc.next());
		sc.nextLine();
		Pedido pedido = new Pedido(new Date(), StatusPagamento.PAGAMENTO_PENDENTE, new Cliente(nome, email, nasc));
		
		System.out.println();
		
		boolean flag = true;
		int cont = 1;
		while(flag == true) {
			System.out.println(cont+"º item");
			System.out.print("Produto: ");
			String produto = sc.nextLine();
			System.out.print("R$: ");
			Double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Quantidade: ");
			Integer qtd = sc.nextInt();
			sc.nextLine();
			PedidoProduto item = new PedidoProduto(qtd, preco, new Produto2(produto, preco));
			pedido.addListaItem(item);
			cont+=1;
			System.out.print("Tem itens?(S/N): ");
			char opc = sc.next().charAt(0);
			sc.nextLine();
			opc = Character.toUpperCase(opc);
			if(opc == 'N') {
				flag = false;
			}
		}
		System.out.println("Sumário");
		System.out.println(pedido);
		sc.close();

	}

}
