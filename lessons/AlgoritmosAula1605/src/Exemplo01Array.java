import java.util.Scanner;
public class Exemplo01Array {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		int k = 3;
		int i = 0;
		int j = 0;
		int soma = 0;
		int media = 0;
		int numImpar = 0;
		int porcentImpar;
		
		for (j=0; j<10; j++){
			System.out.print("Digite um valor para o array "+j+" :");
			vetor[i] = ler.nextInt();
			soma = vetor[i] + soma;
			if (vetor[i]%2 == 1){
				numImpar++;
			}
			i++;
		}
		
		media = soma/i;
		porcentImpar = (100*numImpar)/i;
		
		System.out.println("A soma dos valores � "+soma+". \nA m�dia dos n�meros �: "+media+". \nN�meros acima da m�dia: ");
		for (i=0; i<10; i++){
			if (vetor[i]> media){
				System.out.println(vetor[i]+" no indice "+i);
			} 
		}
		System.out.println("A porcentagem de n�meros impares �: "+porcentImpar+"%");
	}
}
