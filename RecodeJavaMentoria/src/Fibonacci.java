
public class Fibonacci {

	//Criar um progrmama que preencha automaticamente ( usando l�gica, n�o apenas atribuindo diretamente)
	//um vetor num�rico com 15 posi��es com os primeiros elementos da sequ�ncia de Fibonacci:
	
	public static void main(String[] args) {
		int [] array = new int[15];
		int a = 1, b = 0, c = 1;
		
		for (int i = 0; i < 15; i++) {
			array[i] = a;
			a = b + c;
			b = c;
			c = a;
			System.out.print(array[i] + ", ");
		}
		
	}

}