package exerciciosComandoFor;
import java.util.Scanner;
public class I4 {

	public static void main(String[] args) {
		int numero, cont, tabuada;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		for (cont = 1; cont <=10; cont++) {
			tabuada = numero*cont;
			System.out.println(numero + " x " + cont + " = " + tabuada);
		}

	}

}
