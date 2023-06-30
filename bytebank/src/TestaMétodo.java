
public class TestaMétodo {
	public static void main(String[] args) {
		Conta contaGiovanna = new Conta();
		contaGiovanna.saldo = 50;
		contaGiovanna.deposita(100);
		System.out.println(contaGiovanna.saldo);
		boolean conseguiuRetirar = contaGiovanna.saca(25);
		System.out.println(contaGiovanna.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaOtavio = new Conta();
		contaOtavio.deposita(10000);
		boolean sucessoTransferencia = contaOtavio.transfere(5000, contaGiovanna);
		if(sucessoTransferencia) {
			System.out.println("Transferencia realizada com sucesso.");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println(contaGiovanna.saldo);
		System.out.println(contaOtavio.saldo);
		
		contaGiovanna.titular = "Giovanna Calegaro";
		System.out.println(contaGiovanna.titular);
	}
}
