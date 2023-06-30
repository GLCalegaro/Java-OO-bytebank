
public class TestaCaracteres {
	public static void main(String [] args) {
		char letra = 'a';
		System.out.println(letra);
		
		//No char, cada numero equivale à uma letra ou caractér e só guarda 1 caracter;
		char valor = 66;
		System.out.println(valor);

		valor = (char) (valor+ 1);
		System.out.println(valor);
		
		//O mais utilizado será o String;
		String palavra = "Curso Alura & Oracle de Java";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);

	}
}
