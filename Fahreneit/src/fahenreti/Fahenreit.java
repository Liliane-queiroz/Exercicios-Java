package fahenreti;
import java.util.Scanner;
public class Fahenreit {

	public static void main(String[] args) {
		float temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit");
		temp=in.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("A temperatura em Celsius é:" +temp);
	}

}
