package ordenInverso;

import java.util.Scanner;

public class OrdenInverso
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[11];
		for(int i = 0 ; i < numeros.length ; i++)
		{
			System.out.print("Introduce número (total 11): ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = (numeros.length - 1) ; i >= 0 ; i--)
		{
			System.out.println(numeros[i]);
		}
	}
}
