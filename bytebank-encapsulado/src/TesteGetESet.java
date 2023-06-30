
public class TesteGetESet {
	public static void main(String[] args) {
		Conta novaConta = new Conta(33, 4258);
		// Com construtores não é necessário mais acessar com .getNumero() e nem setar
		// com setNumero, pois já setamos direto no parametro em new Conta(33, 4258);
		//novaConta.setNumero(2658);
		//System.out.println(novaConta.getNumero());

		Cliente otavio = new Cliente();
		otavio.setNome("Otavio G N");
		novaConta.setTitular(otavio);
		System.out.println(novaConta.getTitular().getNome());

		// Se quiser por exemplo alterar a profissão do titular de uma conta:
		novaConta.getTitular().setProfissao("Desenvolvedor Back-end");
		System.out.println(otavio);
		// Ou:
		System.out.println(novaConta.getTitular());
	}
}
