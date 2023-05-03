package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String txt1 = "hola clase";
     
     System.out.println(txt1);
     
     String txt2 = "Cantidad de elementos que tiene el Array:" + txt1.length();
     
     System.out.println(txt2);
     
     //Como hago para imprimir el elemento (caracter) numero 2?
     
     System.out.println(txt1.charAt(1));
     
     //Como comparar los strings?: No se usa el == como en los datos primitivos, se usa el metodo equals.
     // ya que los strings trabajan con bloques de memoria y arrojaria datos incorrectos.
     
     if (txt1.equals(txt2));{
    	 
     }
     
     //Para imprimir en mayusculas
     
     System.out.println (txt1.toUpperCase());
     
     //Respetas las mayusculas $^$%^@#^%%^^$%# media hora perdi en eso ya xD
     
     System.out.println("HOLA QUE TAL COMO ESTAN?".toLowerCase());
     //No entiendo mucho la finalidad de este, seria mas facil escribirlo en minusculas.
     
     //Metodo SPLIT
     
     String apellidoYNombre = "Garcia, Cambon";
     
     String nombreYApellidoSeparados[] = apellidoYNombre.split(",");
     
     //String nombreYApellidoSeparados[] = apellidoYNombre.split("r,");
     
     System.out.println(nombreYApellidoSeparados[0]);
     System.out.println(nombreYApellidoSeparados[1]);
     
     String muchaspalabras = "casa arbol melocoton cacatua piripichio";
     
     for (String unaPalabra : muchaspalabras.split(" "));{
    	 
    	 System.out.println(muchaspalabras);
    	 
    	 //Deberia funcionar como en la clase con "unapalabra" pero no me sale, con "muchaspalabras" si
    	 
     }
     
     //Caracteres de escape \t Tabulacion \n realiza un salto de linea
     String dosLineas = "La\tcasa. \nHola.";
     System.out.println (dosLineas);
     		
     String txt3 = "hola otra vez";
     System.out.println(txt3.replace("hola", "Chau"));
     
     //Este solo reemplaza los hola en minusculas no el primero en mayusculas
     String txt4 = "Hola otra vez con hola mayusculas y hola minusculas hola";
     System.out.println(txt4.replace ("hola", "chau"));
 		
		
	}

}
