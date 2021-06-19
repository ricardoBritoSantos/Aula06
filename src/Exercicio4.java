/*Considere  a  criação  de  um  vetor  de  50  posições  chamado vetCarrinhoValores
 * que servirá   para armazenar   os valores de produtos  comprados  por  um  cliente,  e  
 * outro  vetor  de  50  posições chamado  vetCarrinhoNomes  que  servirá  para  armazenar  os  nomes de produtos comprados por um cliente.
 * Crie uma estrutura de menus para que o programa tenha as seguintes funcionalidades:

• Digitar  onome  de  um  produto  e  seu  preço.  (Quando  não  for mais possível inserir itens, deve ser exibida a mensagem: “Carrinho cheio”)
•Remover um produto através de seu nome. (O nome do produto deve ser substituído por “”e o preço por 00. 
A posição não poderá ser reutilizada para armazenar novos valores)
•Calcular o valor total da compra
•Exibir a quantidade de produtos comprados
•Exibir o nome do produto de maior valor(Emcaso de produtos de igual valor, escolher uma das ocorrências)
•Exibir o nome de cada produto ao lado de seu preço
*/
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double totalCompras = 0, produtoMaisCaro = 0;
		double[] vetCarrinhoValores = new double[3];
		String[] vetCarrinhoNomes = new String[3];
		String produto = null;
		int menu = 0, totalItens = 0;
		boolean cheio = false;
		
		while (menu < 7) {
			System.out.println("Escolha a opção desejada:\n");
			System.out.println("1 - Adicionar itens ao Carrinho");
			System.out.println("2 - Excluir itens ao Carrinho");
			System.out.println("3 - Calcular o total e compra");
			System.out.println("4 - Exibir a quantidade de produtos comprados");
			System.out.println("5 - Exibir o nome do produto de maior valor");
			System.out.println("6 - Exibir o nome de cada produto ao lado de seu preço");
			System.out.println("Outros - Sair");
			
			menu = scanner.nextInt();
			
			if (menu == 1) {
				if (!cheio) {
					for (int i = 0; i < vetCarrinhoNomes.length; i++) {
						scanner.nextLine();
						System.out.println("Informar o nome do produto");
						vetCarrinhoNomes[i] = scanner.nextLine();
						System.out.println("Informar o preço do produto");
						vetCarrinhoValores[i] = scanner.nextDouble();
					} 
				}
				System.out.println("Carrinho Cheio\n");
				cheio = true;
			}
			
			if(menu == 2) {
				System.out.println("Informar o nome do produto que deseja remover");
				produto = scanner.next();
				
				for (int i = 0; i < vetCarrinhoNomes.length; i++) {
					if (vetCarrinhoNomes[i].equalsIgnoreCase(produto)) {
						vetCarrinhoNomes[i] = "";
						vetCarrinhoValores[i] = 0;
						
						System.out.println("Produto removido");
					}
				}
			}
			
			if(menu == 3) {			
				for (int i = 0; i < vetCarrinhoNomes.length; i++) {
					totalCompras +=  vetCarrinhoValores[i];
				}
				
				System.out.println("A compra ficou no valor de R$ " + totalCompras);
				totalCompras = 0;
			}
			
			if(menu == 4) {			
				for (int i = 0; i < vetCarrinhoNomes.length; i++) {
					if(!(vetCarrinhoNomes[i].equals(""))) {
						totalItens ++;;
					}
				}
				
				System.out.println("O Total de itens comprados são: " + totalItens);
				totalItens = 0;
			}
			
			if(menu == 5) {			
				for (int i = 0; i < vetCarrinhoNomes.length; i++) {
					if(vetCarrinhoValores[i] > produtoMaisCaro ) {
						produto = vetCarrinhoNomes[i];
						produtoMaisCaro = vetCarrinhoValores[i];
					}
				}
				
				System.out.println("O Produto mais caro é o: " + produto);
				totalItens = 0;
				produtoMaisCaro = 0;
			}
			
			if(menu == 6) {			
				for (int i = 0; i < vetCarrinhoNomes.length; i++) {
					System.out.println(vetCarrinhoNomes[i] + " R$ " + vetCarrinhoValores[i]);
				}
			}
		}
		scanner.close();
	}
}
