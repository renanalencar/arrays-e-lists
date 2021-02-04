package fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 
 * @author Gabriel Botelho, Guilherme Cruz, Wesley Vicente e Renan Alencar
 * @version 1.0
 * @see java.util.Arrays
 *
 */
public class Sistema {

	/***
	 * Método principal da classe para realizar testes na conversão entre listas e
	 * arrays e vice-versa.
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		/*
		 * Para criar um novo array, você precisa especificar o tipo de dado e colocar o
		 * "[]" ao lado para mostrar que você deseja criar um vetor do tipo
		 * especificado. Além disso, na instanciação precisamos dar um tamanho fixo para
		 * o array que estamos criando
		 */
		String[] arrPessoas = new String[4];
		arrPessoas[0] = "Gabriel";
		arrPessoas[1] = "Wesley";
		arrPessoas[2] = "Guilherme";
		arrPessoas[3] = "Renam";

		System.out.println("Lista de valores utilizando Array:");

		imprimirConteudo(arrPessoas);

		// Para atribuir valores para cada posição do array, precisamos acessar a
		// posição utilizando o índice e declarar o que ele contém.

		List<String> lisPessoas = new ArrayList<String>();

		// 1- Transformando arrays em listas

		// Atualmente uma forma fácil de fazer isso é utilizando a classe Arrays que
		// contém um método próprio de transformar array para lista, o asList.

		lisPessoas = Arrays.asList(arrPessoas);

		System.out.println("\nLista de valores List utilizando método da classe Arrays:");
		
		imprimirConteudo(lisPessoas);

		/*
		 * Podemos também fazer da forma mais básica, iterando em cima do array e
		 * inserindo cada elemento dele na lista
		 */

		lisPessoas = new ArrayList<String>();
		for (String nome : arrPessoas) {
			lisPessoas.add(nome);
		}

		System.out.println("\nLista de valores utilizando estrutura de repetição para preencher a lista:");

		imprimirConteudo(lisPessoas);

		// 2- Transformando listas em arrays

		/*
		 * Para transformar uma lista em um array podemos utilizar um método da
		 * interface List e implementado por ArrayList, que é a classe base. Além disso
		 * esse método retorna normalmente um array de objetos; portanto precisamos
		 * passar como parêmetro o tipo de retorno desejado para que ele realize a
		 * conversão.
		 */
		arrPessoas = lisPessoas.toArray(new String[lisPessoas.size()]);

		System.out.println("\nLista de valores utilizando método da classe Collection para transformar em array:");

		imprimirConteudo(arrPessoas);

		/*
		 * Uma outra forma de transformar uma lista em um array seria fazer uma iteração
		 * na mesma para adicionar cada elemento no array. Para inicializar o array
		 * precisaremos utilizar o tamanho total da lista, pois o array tem tamanho
		 * fixo.
		 */

		arrPessoas = new String[lisPessoas.size()];

		for (int i = 0; i < lisPessoas.size(); i++) {
			arrPessoas[i] = lisPessoas.get(i);
		}

		System.out.println("\nLista de valores utilizando estrutura de repetição para preencher o Array:");

		imprimirConteudo(arrPessoas);

	}

	/***
	 * Método para imprimir todo o conteúdo de um array. Recebe como parametro um
	 * array de strings.
	 * 
	 * @param arr String[]
	 */
	public static void imprimirConteudo(String[] arr) {
		for (String s : arr) {
			System.out.println(s);
		}
	}

	/***
	 * Método para imprimir todo conteúdo de uma lista. Recebe como parametro um
	 * objeto do tipo List.
	 * 
	 * @param l List
	 */
	public static void imprimirConteudo(List<String> l) {
		l.forEach(s -> System.out.println(s));
	}

}
