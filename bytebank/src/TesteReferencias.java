
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da 1ª conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da 2º conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Novo saldo da 2ª conta: " + segundaConta.saldo);
		
		System.out.println("Novo saldo da 1ª conta: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("As contas são iguais!");
		}
	}
}
