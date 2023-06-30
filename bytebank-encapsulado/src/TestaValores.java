
public class TestaValores {
	public static void main(String[] args) {
		// Quando criamos construtores, no caso em Conta.java, os parâmetros tornam-se
		// obrigatórios e o Java não compila mais apenas Conta() sem os parâmetros, no
		// caso agencia e numero;
		Conta novaConta = new Conta(237, 5489);
		//novaConta.setAgencia(-66);
		//novaConta.setNumero(-659);
		
		Conta conta2 = new Conta(237, 3248);
		Conta conta3 = new Conta(748, 5837);
		
		System.out.println(Conta.getTotal());
	}
}
