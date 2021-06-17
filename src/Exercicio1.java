import java.util.Scanner;

//1.Fa�a um programa que permita ao usu�rio digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usu�rio escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. 


public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] atividade = new String[30];
		String ordem;
		
		for (int i = 0; i < atividade.length; i++) {
			System.out.println("Digite a " + (i+1) + "� atividades do dia");
			atividade[i] = scanner.next();
		}
		
		System.out.println("Voc� deseja exibir as atividade em ordem?");
		ordem = scanner.next();
		
		if (ordem.equalsIgnoreCase("sim")) {
			for (int i = 0; i < atividade.length; i++) {
				System.out.println( (i+1) + "� atividade: " + atividade[i]);
			}
		}else {
			for (int i = atividade.length; i > 0 ; i--) {
				System.out.println( (i) + "� atividade: " + atividade[i-1]);
			}
		}
		
		scanner.close();

	}

}
