import java.util.LinkedList;

//TESTE

public class Banco {
	private LinkedList<Cliente> clients;
	private LinkedList<Caixa> tellers;

	public Banco() {
		this.clients = new LinkedList<Cliente>();
		this.tellers = new LinkedList<Caixa>();
	}

	public boolean addClient(Cliente client) {
		return this.clients.add(client);
	}

	public boolean addTeller(Caixa teller) {
		return this.tellers.add(teller);
	}

	public LinkedList<Cliente> getClients() {
		return this.clients;
	}

	public LinkedList<Caixa> getTellers() {
		return this.tellers;
	}

}
