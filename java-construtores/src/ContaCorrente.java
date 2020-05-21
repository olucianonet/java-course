
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, Cliente cliente) {
		super(agencia, conta, cliente);
	}	
	
	@Override
	public boolean saca(double valor) {
		// Não existe um sava explicito nesse classe.
		// Mesmo assim, quando chamado o transfere, 
		// o metodo executado sera da classe ContaCorrente
		valor += 0.02;		
		return super.saca(valor);
	}
}
