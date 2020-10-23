package poo;

import java.util.Scanner;

public class Notas {
	 
	public float Nota1;
	public float Nota2;
	public float Nota3;
	public float Nota4;
	public float Media;
	public Scanner Leitura =new Scanner(System.in);
	
	
	
	public void DandoNota(){
		
		System.out.println("Digite Nota1:");
			Nota1=Leitura.nextFloat();
			
			System.out.println("Digite Nota2:");
			Nota2=Leitura.nextFloat();
			
			System.out.println("Digite Nota3:");
			Nota3=Leitura.nextFloat();
			
			System.out.println("Digite Nota4:");
			Nota4=Leitura.nextFloat();
			}
		
	public void CalMedia() {
		
		Media= (Nota1+Nota2+Nota3+Nota4) /4;
			System.out.println("Sua Média é de:" +Media);

	}
	
	
	
	
}



