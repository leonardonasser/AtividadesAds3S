package exercicio3e4;

public class CaixaDeSom {

	private String marca;
	private int volume;
	private boolean tocando;
	private boolean ligado;

	public CaixaDeSom() {
		this.volume = 50;
		this.tocando = false;
		this.ligado = false;
	}

	public CaixaDeSom(String marca) {
		this.marca = marca;
	}

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.ligado = false;
		this.tocando = false;
	}

	public String tocar() {
		if (ligado == true) {
			this.tocando = true;
			return "Está tocando...";
		} else {
			throw new RuntimeException("Não está ligado, porêm não pode tocar!!!");
		}
	}

	public void naoTocar() {
		this.tocando = false;
	}

	public int setVolume(int valor) {
		if (ligado == true) {
			if (valor <= 100) {
				this.volume = valor;
				return valor;
			} else {
				throw new RuntimeException("Limite de volume 100!!");
			}
		} else {
			throw new RuntimeException("Está desligado!!");
		}
	}

}
