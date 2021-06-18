import java.util.Scanner;


//O professor Wuni Jim Yensonal precisa de um programa para ajudar  com  um  problema  simples:  para  uma  turma  com  50  alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão  de  um  atendimento personalizado.  O  fluxo  do  programa deve ser o seguinte: A.Digitar as 50 notasem um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetorB.Calcular a média das notas digitadasC.Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar”


public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[2];
		String[] alunos = new String[2];
		double mediaNotas = 0;
		
		for(int i=0; i < notas.length ; i++) {
			System.out.print("Digitar a " + (i+1) + "º nota: ");
			notas[i] = scanner.nextDouble();
			System.out.print("Digitar o nome do aluno que recebeu essa nota: ");
			alunos[i] = scanner.next();
			
			mediaNotas += notas[i]; 
		}
		
		mediaNotas /= notas.length;
		
		for (int i = 0; i < alunos.length; i++) {
			if (notas[i] < mediaNotas ) {
				System.out.println("Chamar o aluno "+ alunos[i]+" para conversar");
			}
		}
		
		scanner.close();
 
	}

}
