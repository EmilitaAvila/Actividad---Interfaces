package ec.edu.puce.interfaces;

public class Main {

    public static void main(String[] args) {
    	
        Rectangulo r1 = new Rectangulo();
        r1.setBase(7);
        r1.setAltura(15);
        System.out.println("Area del rectángulo 1: " + r1.calcularArea());

        
        Triangulo t1 = new Triangulo();
        t1.setBase(4);
        t1.setAltura(12);
        System.out.println("Area del triángulo 1: " + t1.calcularArea());

        
        Circulo c1 = new Circulo();
        c1.setRadio(10);
        System.out.println("Area del circulo 1: " + c1.calcularArea());
    }
}

