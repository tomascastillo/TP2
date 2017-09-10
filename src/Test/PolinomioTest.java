package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import polinomios.Polinomio;

public class PolinomioTest {

	@Test
	public void hornerGrado1Test() {
		Polinomio p = new Polinomio(new double[]{2});
		Assert.assertEquals(p.evaluarHorner(7),2,0.10);
	}
	@Test
	public void hornerGrado2Test() {
		Polinomio p = new Polinomio(new double[]{2,4});
		Assert.assertEquals(p.evaluarHorner(7),18,0.10);
	}
	@Test
	public void hornerGrado3Test() {
		Polinomio p = new Polinomio(new double[]{5,2,4});
		Assert.assertEquals(p.evaluarHorner(2),28,0.10);
	}
	@Test
	public void hornerCoeficiente0() {
		Polinomio p = new Polinomio(new double[]{0,0,0});
		Assert.assertEquals(p.evaluarHorner(2),0,0.10);
	}
	
}
