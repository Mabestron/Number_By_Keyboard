package com.numusuario.app;
import java.util.Scanner;

public class Numero_por_Usuario 
{

	public static void main(String[] args) 
	{
		int num=0;
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Introduzca el límite de numeros a mostrar: ");
		num=input.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}

	}

}
