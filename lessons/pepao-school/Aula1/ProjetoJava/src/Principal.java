import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		String a = "Olá";
		int num1=0;
		int num2=0;
		
		System.out.println("Olá JAVA");
		System.out.println(a);
		System.out.println(a + " JAVA");
		System.out.println(5 + 3);
		System.out.println("5" + "3");
		num1=3;
		num2=5;
		System.out.println(num1+num2);
		
		System.out.println("Digite o seu nome");
		a = ler.next();
		System.out.println("Olá " + a);
	}

}
