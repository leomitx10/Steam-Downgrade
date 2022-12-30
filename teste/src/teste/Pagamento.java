package teste;

import java.util.ArrayList;

public class Pagamento {
	
	private ArrayList<Formadepagamento> formadepagamento;
	private Cliente cliente;

        public Pagamento(ArrayList<Formadepagamento> formadepagamento, Cliente cliente) {
            this.formadepagamento = formadepagamento;
            this.cliente = cliente;
        }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Formadepagamento> getFormadepagamento() {
		return formadepagamento;
	}

	public void setFormadepagamento(ArrayList<Formadepagamento> formadepagamento) {
		this.formadepagamento = formadepagamento;
	}

}
