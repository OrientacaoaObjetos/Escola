
public class Principal {
	
	public static void main(String[] args) {
		Aluno eu = new Aluno();
		eu.bim1 = 70;
		eu.bim2 = 60;
		eu.bim3 = 80;
		eu.bim4 = 70;
		
		System.out.println(eu.media());
		System.out.println(eu.passouDeAno());
	}

}
