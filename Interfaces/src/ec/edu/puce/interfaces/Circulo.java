package ec.edu.puce.interfaces;

public class Circulo implements FiguraGeometrica {
	
    private int radio;

    
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    
    public int getRadio() {
        return radio;
    }

    
    public void setRadio(int radio) {
        this.radio = radio;
    }  
}

