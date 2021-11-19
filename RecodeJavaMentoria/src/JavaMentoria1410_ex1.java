import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class JavaMentoria1410_ex1 {
	public static void main(String[] args) {
		
		PrintStream show = System.out;
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolhaComputador;
		int escolhaUsuario;
		
		show.println("Ol�! Qual seu nome?");
		String nome = scan.nextLine();
		show.println("Prazer em conhece-lo " + nome + " !");
		show.println(nome + ", voc� quer jogar?");
		show.println("\nInforme o n�mero da sua op��o. \n1 = sim \n2 = n�o");
		
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			show.println("Que pena! fica para a pr�xima");
		}else if (opcao == 1) {
			show.println("Ok, o jogo � assim...");
			show.println("Eu vou escolher um n�mero de 0 a 10...");
			show.println("Mas n�o vou falar para voc� qual foi...");
			show.println("Se voc� conseguir adivinhar qual foi...");
			show.println("Voc� ser� o vencedor!");
			
			escolhaComputador = gerador.nextInt(11);
			
			show.println("Ok, " + nome + ". Eu j� escolhi!");
			show.println("Agora tente adivinhar!");
			
			//somar tentativas no final mostrar quantas vezes eu adivinhei
			int count = 0;
			
			do {
				count = count + 1;
				escolhaUsuario = scan.nextInt();
				if(escolhaUsuario != escolhaComputador) {
					show.println("Resposta errada!");
				}else {
					show.println("Parabens! Voc� acertou! com " + count + (count == 1 ? " tentativa":" tentativas"));
				}
			}while (escolhaComputador != escolhaUsuario);
			scan.close();
			
		}
		
	}
}
