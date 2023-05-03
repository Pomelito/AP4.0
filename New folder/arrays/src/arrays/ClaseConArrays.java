/**
 * 
 */
package arrays;

/**
 * @author Vaygr
 *
 */
public class ClaseConArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lado izquierdo declaramos el Array
		//Lado derecho asignamos valores
		//Una vez creado el array no se puede modificar en su cantidad de elementos, pero si los valores
		
		//Esta declaracion se hace cuando no conozco los valores
		
		int numeros [] = new int [3];
		
		numeros [0] = 1;
		numeros [1] = 23;
		numeros [2] = 32;
		
		//System.out.println (numeros);
		
		//Esta declaracion se hace cuando ya conozco los valores
		int numeros2[] = {1, 23, 32};
		
		//Esta es otra manera de declarar un Array
		
		int numeros3[] = new int []{1, 23, 32};
		
		System.out.println("cantidad de elementos que tiene el Array: "+ numeros.length);
        
		//esto es lo que sucede en cada ciclo del FOR
	    //System.out.println("El elemento en la posicion 1 Es: "+numeros[0]);
	    //System.out.println("El elemento en la posicion 2 Es: "+numeros[1]);
	    //System.out.println("El elemento en la posicion 3 Es: "+numeros[2]);

		
		for (int i = 0; i < numeros.length; i ++) {
		
		//Para ejecutar instrucciones dentro del FOR
		//	numeros[i] = numeros[i]*2;
			
	    System.out.println("El elemento en la posicion" +(i+1) + " Es: "+numeros[i]);
	    
		}
		
		
		//Esta es otra manera de pedir los datos, reemplazando numeros por num (no se con que fin)
		for (int num : numeros) {
			System.out.println(num);
		}
		
		//Array de letras
		
		char letras [] = {'a', 'b', 'c','d'};
		
		for (char letra : letras) {
			System.out.println (letra);
		}
	
	
	}
	
	

}
//La sintaxis de punto “.” indica que estamos accediendo a una propiedad de
//la variable. Lo que vimos como “tipos primitivos” no lo permiten, pero los
//arrays tienen una fundamental: “length”, que nos dice el tamaño del array.
