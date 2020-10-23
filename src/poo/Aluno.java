package poo;
import java.util.Scanner;
public class Aluno extends Notas{

	
	
	public String Nome;
	public String Curso;
	
	
	public Aluno() {
		Nomear();
		Cursando();
		DandoNota();
		CalMedia();
		
	}
	
	
	public void Nomear() {
		
		System.out.println("Nome do aluno:");
			Nome=Leitura.next();
	}
	
public void Cursando() {
		
		System.out.println("Qual o curso:");
			Curso=Leitura.next();
	}	
}
