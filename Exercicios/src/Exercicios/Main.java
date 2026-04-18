package Exercicios;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite seu nome:");
		String user;
		Scanner reader = new Scanner(System.in);
		user = reader.nextLine();
		System.out.println("Olá," + user + ", seja bem-vindo(a)!!");
	}

}

