package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente pedro = new Cliente(null, null);
		pedro.setNome("Pedro Henrique");

		Conta poupanca = new ContaPoupanca(pedro);
		Conta cc = new ContaCorrente(pedro);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
