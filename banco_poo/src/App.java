public class App {
    public static void main(String[] args) throws Exception {
        cliente cliente1 = new cliente();
		cliente1.setNome("zé");
		
		conta cc = new contaCorrente(cliente1);
		conta poupanca = new contaPoupanca(cliente1);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
