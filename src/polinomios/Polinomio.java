package polinomios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polinomio {

	private int grado;
	private double[] coeficientes;
	
	public Polinomio(int grado, double[] coeficientes){
		this.grado = grado;
		this.coeficientes = coeficientes;
	}
	public Polinomio(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		
		grado = sc.nextInt();
		coeficientes = new double[grado+1];
		for(int i=0; i<=grado; i++){
			coeficientes[i] = sc.nextDouble();
		}
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
