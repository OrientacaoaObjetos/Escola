
//Modo estruturado de desenvolvimento
public class VerificadoraNotas {
	
	public static int mediaAluno(Aluno a) {
		int total = 0;
		
		total += a.bim1;
		total += a.bim2;
		total += a.bim3;
		total += a.bim4;
		
		return total / 4;
	}
	
	public static boolean passouDeAno(Aluno a) {
		int mediaAluno = mediaAluno(a);
		
		if (mediaAluno >= 60)
			return true;
		else 
			return false;
	}

}
