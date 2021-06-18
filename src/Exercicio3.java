import java.util.Random;

//3.Fa�a um algoritmo que gere aleatoriamente atrav�s de um la�o de  repeti��o  PARA  um  vetor  de  50  elementos  inteiros  (entre  0 -9), calcule e exiba:�A quantidade de n�meros entre 3 e 7;�Quantidade de n�meros pares;�A quantidade de n�meros menores que 3;�Quantidade de n�meros �mpares.Obs.: O  vetor  com  os  50  elementos  deve  ser  impresso  na  tela tamb�m. 

public class Exercicio3 {

	public static void main(String[] args) {

		int[] vetor = new int[50];
		int qtdeNumerosEntre = 0, qtdeNumerosPares = 0, qtdeNumerosImpares = 0,qtdeNumerosMenores = 0 ; 
		Random aleatorio = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(10);
			
			if (vetor[i] > 3 && vetor[i] < 7) {
				qtdeNumerosEntre++;
			}
			
			if (vetor[i] < 3) {
				qtdeNumerosMenores++;
			}
			
			if((vetor[i] % 2) == 0) {
				qtdeNumerosPares++;
			}else {
				qtdeNumerosImpares++;
			}
			
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\nQuantidade de numeros entre 3 e 7 s�o " + qtdeNumerosEntre);
		System.out.println("Quantidade de numeros pares s�o " + qtdeNumerosPares);
		System.out.println("Quantidade de numeros menores que 3 s�o " + qtdeNumerosMenores);
		System.out.println("Quantidade de numeros impares s�o " + qtdeNumerosImpares);
		
	}

}
