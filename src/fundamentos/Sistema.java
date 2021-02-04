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
	 * M�todo principal da classe para realizar testes na convers�o entre listas e
	 * arrays e vice-versa.
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		/*
		 * Para criar um novo array, voc� precisa especificar o tipo de dado e colocar o
		 * "[]" ao lado para mostrar que voc� deseja criar um vetor do tipo
		 * especificado. Al�m disso, na instancia��o precisamos dar um tamanho fixo para
		 * o array que estamos criando
		 */
		String[] arrPessoas = new String[4];
		arrPessoas[0] = "Gabriel";
		arrPessoas[1] = "Wesley";
		arrPessoas[2] = "Guilherme";
		arrPessoas[3] = "Renam";

		System.out.println("Lista de valores utilizando Array:");

		imprimirConteudo(arrPessoas);

		// Para atribuir valores para cada posi��o do array, precisamos acessar a
		// posi��o utilizando o �ndice e declarar o que ele cont�m.

		List<String> lisPessoas = new ArrayList<String>();

		// 1- Transformando arrays em listas

		// Atualmente uma forma f�cil de fazer isso � utilizando a classe Arrays que
		// cont�m um m�todo pr�prio de transformar array para lista, o asList.

		lisPessoas = Arrays.asList(arrPessoas);

		System.out.println("\nLista de valores List utilizando m�todo da classe Arrays:");
		
		imprimirConteudo(lisPessoas);

		/*
		 * Podemos tamb�m fazer da forma mais b�sica, iterando em cima do array e
		 * inserindo cada elemento dele na lista
		 */

		lisPessoas = new ArrayList<String>();
		for (String nome : arrPessoas) {
			lisPessoas.add(nome);
		}

		System.out.println("\nLista de valores utilizando estrutura de repeti��o para preencher a lista:");

		imprimirConteudo(lisPessoas);

		// 2- Transformando listas em arrays

		/*
		 * Para transformar uma lista em um array podemos utilizar um m�todo da
		 * interface List e implementado por ArrayList, que � a classe base. Al�m disso
		 * esse m�todo retorna normalmente um array de objetos; portanto precisamos
		 * passar como par�metro o tipo de retorno desejado para que ele realize a
		 * convers�o.
		 */
		arrPessoas = lisPessoas.toArray(new String[lisPessoas.size()]);

		System.out.println("\nLista de valores utilizando m�todo da classe Collection para transformar em array:");

		imprimirConteudo(arrPessoas);

		/*
		 * Uma outra forma de transformar uma lista em um array seria fazer uma itera��o
		 * na mesma para adicionar cada elemento no array. Para inicializar o array
		 * precisaremos utilizar o tamanho total da lista, pois o array tem tamanho
		 * fixo.
		 */

		arrPessoas = new String[lisPessoas.size()];

		for (int i = 0; i < lisPessoas.size(); i++) {
			arrPessoas[i] = lisPessoas.get(i);
		}

		System.out.println("\nLista de valores utilizando estrutura de repeti��o para preencher o Array:");

		imprimirConteudo(arrPessoas);

	}

	/***
	 * M�todo para imprimir todo o conte�do de um array. Recebe como parametro um
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
	 * M�todo para imprimir todo conte�do de uma lista. Recebe como parametro um
	 * objeto do tipo List.
	 * 
	 * @param l List
	 */
	public static void imprimirConteudo(List<String> l) {
		l.forEach(s -> System.out.println(s));
	}

}
