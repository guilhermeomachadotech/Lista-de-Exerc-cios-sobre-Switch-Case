import java.util.Scanner;
public class Mencao {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		int qtddAluno, qtddMb, qtddB, qtddR, qtddI, mencao;
		double porcemMb, porcemB, porcemR, porcemI;
		System.out.println ("Digite a quantidade total de alunos da sala:");
		qtddAluno=ler.nextInt();
		System.out.println ("Digite a quantidade de alunos com menção MB:");
		qtddMb=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com meção B:");
		qtddB=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com menção R:");
		qtddR=ler.nextInt ();
		System.out.println ("Digite a quantidade de alunos com menção I:");
		qtddI=ler.nextInt ();
		porcemMb=(qtddMb*100)/qtddAluno;
		porcemB=(qtddB*100)/qtddAluno;
		porcemR=(qtddR*100)/qtddAluno;
		porcemI=(qtddI*100)/qtddAluno;
		System.out.println ("Digite 1 para ver a estatísticas dos alunos MB, 2 para B, 3 para R ou 4 para I:");
		mencao=ler.nextInt ();
		switch (mencao) {
			case 1:
				System.out.println (porcemMb+"% de alunos com menção MB.");
				break;
			case 2:
				System.out.println (porcemB+"% de alunos com menção B.");
				break;
			case 3:
				System.out.println (porcemR+"% de alunos com menção R.");
				break;
			case 4:
				System.out.println (porcemI+"% de alunos com menção I.");
				break;
			default:
				System.out.println ("Menção inválida.");
		}
		ler.close ();
	}
}
