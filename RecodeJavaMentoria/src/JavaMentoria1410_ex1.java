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
		
		show.println("Olá! Qual seu nome?");
		String nome = scan.nextLine();
		show.println("Prazer em conhece-lo " + nome + " !");
		show.println(nome + ", você quer jogar?");
		show.println("\nInforme o número da sua opção. \n1 = sim \n2 = não");
		
		opcao = scan.nextInt();
		
		if(opcao == 2) {
			show.println("Que pena! fica para a próxima");
		}else if (opcao == 1) {
			show.println("Ok, o jogo é assim...");
			show.println("Eu vou escolher um número de 0 a 10...");
			show.println("Mas não vou falar para você qual foi...");
			show.println("Se você conseguir adivinhar qual foi...");
			show.println("Você será o vencedor!");
			
			escolhaComputador = gerador.nextInt(11);
			
			show.println("Ok, " + nome + ". Eu já escolhi!");
			show.println("Agora tente adivinhar!");
			
			//somar tentativas no final mostrar quantas vezes eu adivinhei
			int count = 0;
			
			do {
				count = count + 1;
				escolhaUsuario = scan.nextInt();
				if(escolhaUsuario != escolhaComputador) {
					show.println("Resposta errada!");
				}else {
					show.println("Parabens! Você acertou! com " + count + (count == 1 ? " tentativa":" tentativas"));
				}
			}while (escolhaComputador != escolhaUsuario);
			scan.close();
			
		}
		
	}
}
