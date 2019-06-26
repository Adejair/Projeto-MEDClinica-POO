
public class MedicoTester {

	public static void main(String[] args) {
		CirugiaoGeral claudinho = new CirugiaoGeral();

		System.out.println(claudinho.getTitulacaoMedico());
		
		claudinho.carregarHabilidades()
			.forEach(habilidade->System.out.println(habilidade));
	
		Fonoaudiologo ricardinho = new Fonoaudiologo();
		
		System.out.println(ricardinho.getTitulacaoMedico());
		
		ricardinho.carregarHabilidades().forEach(habilidade->System.out.println(habilidade));
	}

}
