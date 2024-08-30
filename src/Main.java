
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100, "Senha aqui");
		cc.transferir(100, poupanca, "Senha aqui");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
