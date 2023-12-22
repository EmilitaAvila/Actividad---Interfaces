package ec.edu.puce.interfaces;

public class Rectangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public double calcularArea() {
		return this.altura * this.base;
	}
	

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
}


