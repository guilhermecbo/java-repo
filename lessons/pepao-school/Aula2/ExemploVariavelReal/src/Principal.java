import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner(System.in);
	double numero1 =0;
	double numero2 =0;
	double resultado =0;
	
	System.out.println("Informe um n�mero ");
	numero1 = ler.nextDouble();
	System.out.println("Informe outro n�mero ");
	numero2 = ler.nextDouble();
	
	resultado = numero1 / numero2;
	
	System.out.println("Divis�o: " + resultado);
	
	
	}

}
