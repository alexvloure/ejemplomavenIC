package ejemplomavenIC;

public class Calc {

	private int i;
	private int j;

	public Calc(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public Integer sumar() {
		return this.i + this.j;
	}

	public Integer restar() {
		return this.i - this.j;
	}

	public Integer multiplicar() {
		return this.i * this.j;
	}

	public Integer dividir() {
		return this.i / this.j;
	}

}
