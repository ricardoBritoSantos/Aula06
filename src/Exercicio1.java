import java.util.Scanner;

//1.Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. 


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] atividade = new String[30];
		String ordem;
		
		for (int i = 0; i < atividade.length; i++) {
			System.out.println("Digite a " + (i+1) + "º atividades do dia");
			atividade[i] = scanner.next();
		}
		
		System.out.println("Você deseja exibir as atividade em ordem?");
		ordem = scanner.next();
		
		if (ordem.equalsIgnoreCase("sim")) {
			for (int i = 0; i < atividade.length; i++) {
				System.out.println( (i+1) + "º atividade: " + atividade[i]);
			}
		}else {
			for (int i = atividade.length; i > 0 ; i--) {
				System.out.println( (i) + "º atividade: " + atividade[i-1]);
			}
		}
		
		scanner.close();

	}

}
