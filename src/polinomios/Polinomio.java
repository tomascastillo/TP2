package polinomios;

public class Polinomio {

	private int grado;
	private double[] coeficientes;
	
	public Polinomio(int grado, double[] coeficientes){
		this.grado = grado;
		this.coeficientes = coeficientes;
	}
	
	public double evaluarMSucesivas (double x){ return 0; }
	public double evaluarRecursiva (double x){ return 0; }
	public double evaluarRecursivaPar (double x) { return 0; }
	public double evaluarProgDinamica (double x) { return 0; }
	public double evaluarMejorada (double x){return 0;}
	
	/**
	 * HORNER=> O(n)
	 */
	public double evaluarHorner ( double x ) { 
		double res = 0;
		for (int i=0; i <= grado; res = res*x + coeficientes [i], i++ );
		return res;	
	}
	
	
}
