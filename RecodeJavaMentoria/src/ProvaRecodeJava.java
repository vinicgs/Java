import java.util.Scanner;

public class ProvaRecodeJava {

	public static void main(String[] args) {
		int quantidadeNotas = 5;
		
		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		int soma = 0;
		double media = 0;
		for(int i = 1; i<=quantidadeNotas;i++) {
			nota = entrada.nextInt();
			soma = soma + nota;
		}
		media = soma /5;
		if (media > 6 ) {
			System.out.println("Sua média foi " + media + " Aprovado");
		}else {
			System.out.println("Sua média foi " + media + " Reprovado");
		}
		System.out.println("Soma dos valores = " + soma);
		System.out.println("Media dos valores = " + media);
		entrada.close();
	}

}
