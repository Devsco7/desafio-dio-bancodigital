package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private String nome;
	private List<Conta> contas;

	public Banco() {
		this.clientes = new ArrayList<>();
		this.contas = new ArrayList<>();
	}
	

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

	public List<Cliente> listarClientes() {
		return clientes;
	}

	public static void main(String[] args) {
		Banco banco = new Banco();

		Cliente cliente1 = new Cliente("Pedro", "123.454.653-00");
		Cliente cliente2 = new Cliente("Damaris", "123.455.654-00");
		Cliente cliente3 = new Cliente("Edma", "123.456.655-00");

		banco.adicionarCliente(cliente1);
		banco.adicionarCliente(cliente2);
		banco.adicionarCliente(cliente3);

		List<Cliente> clientes = banco.listarClientes();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
