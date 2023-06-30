
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadedepPessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		} else {
			if (quantidadedepPessoas >= 2) {
				System.out.println("Você tem menos de 18 anos, mas está acompanhado, bem-vindo!");
			} else {
				System.out.println("Você não tem permissão para entrar, usuário tem menos de 18 anos");
			}
		}
	}
}
