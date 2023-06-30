
public class TesteSacaNegativos {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.deposita(100);
		System.out.println(novaConta.saca(150));

		// Para permitir saques negativos, fazemos o conforme o código abaixo, porém em
		// nosso projeto, faremos uma regra para que não seja possível saques de valores
		// negativos usando o atributo 'private' na classe Conta.java. e após isso, o java não irá compilar nosso código.
		//novaConta.saldo = novaConta.saldo - 150;
		//System.out.println(novaConta.saldo);

		//Sendo assim, modificamos o código:
		novaConta.saca(150);
		//Para acessar o saldo agora criamos um novo método em Conta.java para que possamos acessá-lo:
		System.out.println(novaConta.getSaldo());

	}
}
