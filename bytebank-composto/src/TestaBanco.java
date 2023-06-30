
public class TestaBanco {
	public static void main(String[] args) {
		Cliente giovanna = new Cliente();
		giovanna.nome = "Giovanna Calegaro";
		giovanna.cpf = "265.265.256-59";
		giovanna.profissao = "Programadora";

		// Criando o objeto conta na memória e guardando o número da referência - associa o cliente giovanna com a contadaGiovanna;
		Conta contadaGiovanna = new Conta();
		contadaGiovanna.deposita(600);

		contadaGiovanna.titular = giovanna;

		System.out.println(contadaGiovanna.titular.nome);
		// Se colocar apenas titular, o Java não vai retornar nada, por padrão, strings
		// "vazias" aparecem como 0 ou no formato "@545749ad" por exemplo;
		System.out.println(contadaGiovanna.titular);
	}
}
