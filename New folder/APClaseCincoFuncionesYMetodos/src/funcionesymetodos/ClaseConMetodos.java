package funcionesymetodos;

public class ClaseConMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int vectorNumeros[] = {10, 20, 30, 50, -2, 50, -10};
	
	System.out.println(sumatoriaDeNumeros(vectorNumeros));
	
	}

  
 public static int sumatoriaDeNumeros (int vectorDeNumeros[]) {

	 
		int sumatoriaDeNumeros = 0;
		
		for (int num : vectorDeNumeros)
						
		{sumatoriaDeNumeros = sumatoriaDeNumeros + num;
		
		}
	 
	 
	 return sumatoriaDeNumeros;
 }
}
			
	 
	
	
