package soma;

import java.util.Scanner;

public class Somar {

	public static void main(String[] args) {
		int n1,n2, res;
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("=====ADIÇÃO=====");
		System.out.println("Digite o núemro 1:");
		n1 = scn.nextInt();
		
		System.out.println("Digite o núemro 1:");
		n2 = scn.nextInt();
		
		res = n1+n2;
		System.out.println("O resultado corresponde a " + res);

	}

}
