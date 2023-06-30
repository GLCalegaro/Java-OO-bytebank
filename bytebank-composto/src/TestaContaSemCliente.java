
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contadaDani = new Conta();
		System.out.println(contadaDani.getSaldo());
		
		//Para que não haja erros ou a saida seja null, deixaremos automatica a referencia de Cliente c/ Conta;
		contadaDani.titular = new Cliente();
		System.out.println(contadaDani.titular);
		
		contadaDani.titular.nome = "Dani";
		System.out.println(contadaDani.titular.nome);
	}
}
