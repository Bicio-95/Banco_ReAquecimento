import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco bank = new Banco();

		for (int n = 1; n <= 10; n++) {
			bank.addTeller(new Caixa(n));
		}

		Scanner scanner = new Scanner(System.in);
		String option = "";
		String cliente_nome;
		int cliente_idade;
		int teller_number;

		while (!option.equals("3")) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Registrar cliente");
			System.out.println("2 - Solicitar próximo cliente");
			System.out.println("3 - Sair");

			option = scanner.next();

			switch (option) {
				case "1":
					System.out.print("Nome do cliente: ");
					cliente_nome = scanner.next();
					System.out.print("Idade do cliente: ");
					cliente_idade = scanner.nextInt();
					bank.addClient(new Cliente(cliente_nome, cliente_idade));
					break;
				case "2":
					System.out.print("Número do caixa: ");
					teller_number = scanner.nextInt();
					bank.getTellers().get(teller_number).attendClient(bank.getClients());
					break;
			} 
		}

	}
}
