package media;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		int n1,n2,n3, res;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("=====ADIÇÃO=====");
		System.out.println("Digite o núemro 1;");
		n1 = scn.nextInt();
		
		System.out.println("Digite o núemro 2;");
		n2 = scn.nextInt();
		
		System.out.println("Digite o núemro 3;");
		n3 = scn.nextInt();
		
		res = (n1+n2+n3)/3;
		
		System.out.println("A média corresponde a " + res);

	}

}
