package desafio_dio_banco;

public interface IConta {
	// atributos

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();
}
