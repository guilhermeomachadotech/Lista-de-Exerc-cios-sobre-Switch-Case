import java.util.Scanner;
public class CategoriaAluno {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		byte idadeAluno;
		System.out.println ("Digite a idade do aluno da escola de futebol:");
		idadeAluno=ler.nextByte();
		switch (idadeAluno) {
			case 6:
				System.out.println("Dentes de leite.");
				break;
			case 7:
				System.out.println ("J�nior.");
				break;
			case 8:
				System.out.println ("J�nior max.");
				break;
			case 9:
				System.out.println ("J�nior master.");
				break;
			case 10:
				System.out.println ("Master.");
				break;
			default:
				System.out.println ("A escola n�o adimitem o aluno dessa idade.");
		}
		ler.close();
	}

}
