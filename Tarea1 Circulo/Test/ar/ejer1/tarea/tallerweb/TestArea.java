package ar.ejer1.tarea.tallerweb;

import org.junit.Assert;
import org.junit.Test;

public class TestArea {

	@Test
	public void test() {
		Circulo circ = new Circulo();
		double area = circ.area();
		System.out.println("area = "+area);
		Assert.assertEquals(3.1416, area,0.0001);
	}

}
