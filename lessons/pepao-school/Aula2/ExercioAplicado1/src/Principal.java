import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1=0;
		
		Scanner ler = new Scanner(System.in);
		//ENTRADAS
		System.out.println("Informe um n�mero inteiro");
		numero1 = ler.nextInt();
		System.out.println("Informe outro n�mero inteiro");
		int numero2 = ler.nextInt();
		
		//PROCESSAMENTO
		int soma = numero1 + numero2;
		
		//SA�DA
		System.out.println("Resultado: " + soma);
		
		

	}

}
