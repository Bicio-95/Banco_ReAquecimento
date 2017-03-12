/*
Um banco implantou um sistema para controlar o acesso dos clientes aos caixas. Cada cliente, ao chegar, registra-se no sistemas, 
informando seu nome e sua idade. Os caixas, quando liberados, solicitam ao sistema o pr�ximo cliente. O sistema est� projetado para 
dar prioridade a clientes idosos, da seguinte forma:

==> Os caixas de 1 a 5 dever�o dar prioridade aos clientes com 65 anos ou mais. Assim, se houver clientes desta faixa et�ria, 
aquele que tiver chegado h� mais tempo deve ser selecionado. Caso n�o haja, seleciona o cliente (de qualquer idade) que est� a espera;

==>Os caixas de 6 em diante devem selecionar o cliente que est� h� mais tempo a espera, seja ele de que idade for.
Implemente este sistema. A interface com o usu�rio deve oferecer duas op��es: uma para o caixa solicitar o pr�ximo cliente 
(que ser� selecionado de acordo com as regras de prioridade), e uma para o cliente se registrar quando chega ao banco. 
Esta interface pode ser gr�fica ou textual (de prefer�ncia, gr�fica, para praticar).

*/


import java.util.LinkedList;


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
