package ar.ejer1.tarea.tallerweb;
import java.util.Scanner;
public class Circulo {

	public double perimetro(){
	
	double per;
	float diametro;
	Scanner in = new Scanner(System.in);
	per = 0;
	
	System.out.println("Escriba el diametro del circulo: ");
	diametro= in.nextFloat();
	per = 3.1416 * diametro;
	
	return per;	
	}
	
	public double area(){
	double area,radio;
		
	Scanner in = new Scanner(System.in);
	System.out.println("Escriba el radio del circulo: ");
	radio = in.nextFloat();
	area = 3.1416*Math.pow(radio,2);
	return area;	
	}
	
}
