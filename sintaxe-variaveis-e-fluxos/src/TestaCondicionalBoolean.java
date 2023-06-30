
public class TestaCondicionalBoolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 10;
		int quantidadedePessoas = 3;
		boolean acompanhado = quantidadedePessoas >= 2;
		
		System.out.println("Total de acompanhantes = " + acompanhado);
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
				System.out.println("Desculpe, você não tem permissão para entrar, usuário tem menos de 18 anos.");
			}
		}
	}

