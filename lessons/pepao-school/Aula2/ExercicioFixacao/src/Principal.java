import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suc=0;
		int ant=0;
		//ENTRADAS
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva um n�mero");
		numero = ler.nextInt();
		//PROCESSAMENTO
		ant = numero -1;
		suc = numero +1;
		//SA�DA
		System.out.println("O n�mero anterior �: " + ant);
		System.out.println("O n�mero sucessor �: " + suc);
		
		
	}

}
