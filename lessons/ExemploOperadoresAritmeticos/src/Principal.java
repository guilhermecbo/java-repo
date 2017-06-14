import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int numero1 =0;
		int numero2 =0;
		int resultado =0;
		int resto =0;
		
		System.out.println("Informe um número inteiro");
		numero1=ler.nextInt();
		System.out.println("Informe outro número inteiro");
		numero2=ler.nextInt();
		
		resultado=numero1 + numero2;
		System.out.println("Soma: " + resultado);
		
		resultado=numero1 - numero2;
		System.out.println("Subtração: " + resultado);
		
		resultado=numero1 * numero2;
		System.out.println("Multiplicação: " + resultado);
		
		resto=numero1 % 2;
		System.out.println("Resto: " + resto);
	}

}
