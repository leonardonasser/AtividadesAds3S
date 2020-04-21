package exercicio3e4;

public class App {

	public static void main(String[] args) {

		CaixaDeSom jbl = new CaixaDeSom();

		try {
			jbl.ligar();
			int volume = jbl.setVolume(100);
			System.out.println(volume);
		} catch (RuntimeException alertaVol) {
			System.out.println(alertaVol.getMessage());
		}
		System.out.println("Acabou teste1");

		
		System.out.print("\n===================================\n\n");
		
		try {
			jbl.ligar();
			int volume = jbl.setVolume(110);
			System.out.println(volume);
		} catch (RuntimeException alertaVol) {
			System.out.println(alertaVol.getMessage());
		}
		System.out.println("Fim Teste2");
		
		System.out.print("\n===================================\n\n");
		
		try {
			jbl.desligar();
			jbl.tocar();
			String volume = jbl.tocar();
			System.out.println(volume);
		} catch (RuntimeException alertaVol) {
			System.out.println(alertaVol.getMessage());
		}
		System.out.println("Fim Teste3");
		
		
		System.out.print("\n===================================\n\n");
		
		try {
			jbl.ligar();
			jbl.tocar();
			String volume = jbl.tocar();
			System.out.println(volume);
		} catch (RuntimeException alertaVol) {
			System.out.println(alertaVol.getMessage());
		}
		System.out.println("Fim Teste4");
	
	
	
	
	}

}
