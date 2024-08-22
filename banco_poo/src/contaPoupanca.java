public class contaPoupanca extends conta {
    public contaPoupanca(cliente cliente) {
		super(cliente);
	}

	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
