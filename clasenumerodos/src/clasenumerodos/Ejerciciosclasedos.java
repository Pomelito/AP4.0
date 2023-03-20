package clasenumerodos;

public class Ejerciciosclasedos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int unnum = 5;
		
		while (unnum > 0 ) {
			
			System.out.println (unnum);
			
			//unnum = unnum -1; se puede utilizar de esa manera
			//o escribir unnum--; la mecanica es la misma
			
			unnum--;
			
			//hasta aca funciona bien
		}
		
		for (int otronum=0; otronum<10;otronum++) {
			System.out.println (otronum);
			
			//int otronum=0 es el numero base para arrancar el FOR
			//otronum<10; le decimos hasta que condicion tiene que seguir
			//osea hasta que ese numero sea MENOR a 10
			//otronum++ le decimos que en cada ciclo que entra al for le sume uno al numero
			
		}
	}

}
