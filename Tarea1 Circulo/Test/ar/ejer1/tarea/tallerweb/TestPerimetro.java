package ar.ejer1.tarea.tallerweb;

import org.junit.Assert;

public class TestPerimetro {

@org.junit.Test
	public void test() {
		Circulo circ = new Circulo();
		double perimetro = circ.perimetro();
		System.out.println("perimetro = "+perimetro);
		Assert.assertEquals(3.1416, perimetro,0.0001);

	}

}
