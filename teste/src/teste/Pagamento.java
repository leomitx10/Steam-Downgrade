package teste;

import java.util.ArrayList;

public class Pagamento {
	
	private ArrayList<formaDePagamento> formadepagamento;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<formaDePagamento> getFormadepagamento() {
		return formadepagamento;
	}

	public void setFormadepagamento(ArrayList<formaDePagamento> formadepagamento) {
		this.formadepagamento = formadepagamento;
	}

}
