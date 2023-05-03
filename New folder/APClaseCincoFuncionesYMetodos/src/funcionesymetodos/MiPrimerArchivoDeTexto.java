package funcionesymetodos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiPrimerArchivoDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String RutaAbsoluta = "C:\\eclipse-workspace\\APClaseCincoFuncionesYMetodos\\bin\\funcionesymetodos\\Resources\\Untitled 2.txt";
				
		String RutaRelativa = "resources/Untiles 2.txt";
		
		
		Path PathDelArchivo = Paths.get(RutaRelativa, args);
		
		try {
			for (String linea : Files.readAllLines(PathDelArchivo)) {
				System.out.println(linea);
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	}

}
