import java.util.Scanner;
public class Mencao {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		int qtddAluno, qtddMb, qtddB, qtddR, qtddI, mencao;
		double porcemMb, porcemB, porcemR, porcemI;
		System.out.println ("Digite a quantidade total de alunos da sala:");
		qtddAluno=ler.nextInt();
		System.out.println ("Digite a quantidade de alunos com men��o MB:");
		qtddMb=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com me��o B:");
		qtddB=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com men��o R:");
		qtddR=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com men��o I:");
		qtddI=ler.nextInt ();
		porcemMb=(qtddMb*100)/qtddAluno;
		porcemB=(qtddB*100)/qtddAluno;
		porcemR=(qtddR*100)/qtddAluno;
		porcemI=(qtddI*100)/qtddAluno;
		System.out.println ("Digite 1 para ver a estat�sticas dos alunos MB, 2 para B, 3 para R ou 4 para I:");
		mencao=ler.nextInt ();
		switch (mencao) {
			case 1:
				System.out.println (porcemMb+"% de alunos com men��o MB.");
				break;
			case 2:
				System.out.println (porcemB+"% de alunos com men��o B.");
				break;
			case 3:
				System.out.println (porcemR+"% de alunos com men��o R.");
				break;
			case 4:
				System.out.println (porcemI+"% de alunos com men��o I.");
				break;
			default:
				System.out.println ("Men��o inv�lida.");
		}
		ler.close ();
	}
}
