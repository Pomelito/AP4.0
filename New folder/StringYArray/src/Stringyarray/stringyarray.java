package Stringyarray;

public class stringyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio numero 1 punto A
		
		String txt = "Esto es para contar la cantidad de veces que aparece la letra a en esta oracion";
		System.out.println(txt.indexOf("a"));
		
		//Ejercicio numero uno punto B
		
		int numeros [] = new int [3];
		
		numeros [0] = 9;
		numeros [1] = 18;
		numeros [2] = 27;
		
	    System.out.println("El elemento en la posicion 1 Es: "+numeros[0]);
	    System.out.println("El elemento en la posicion 2 Es: "+numeros[1]);
	    System.out.println("El elemento en la posicion 3 Es: "+numeros[2]);
	    
	    //Ejercicio numero uno punto c
	    
	    int [] puntoc = new int [3];
	    
	    puntoc [0] = 27;
	    puntoc [1] = 9;
	    puntoc [2] = 18;
	    
	    for (int i = 0; i<3; i++)
	    
	    System.out.println ("puntoc");
	    
	    int suma = puntoc[0] + puntoc[1] + puntoc[2];
	    
	    System.out.println ("La resultado de los tres numeros es" + suma);
	    
	    //En el segundo ejercicio o bien yo no entiendo la consigna, o es algo que no vimos en la clase.
	    
	    //ni codificar ni decodificar strings, vimos upper case, lower case, split, saltos como por ejemplo \n
	    
	    //pero ordenar letras no.
	    
	    String txt5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("The length of the txt string is: " + txt5.length());
	    
	    //esta parte es la que vi en w3schools

	    
	    }

}
