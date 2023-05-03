package org.Example.ExampleLecturaCSV;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.Example.ExampleLecturaCSV.models.Pronostico;
import org.Example.ExampleLecturaCSV.models.Resultado;

public class LectorArchivos {

    public List<Resultado> parsearResultados(String rutaDelArchivoResultados) {
   
    List<Resultado> listaDeResultados = null;
    
    try {
    
    
    // Usando try y catch controlamos que datos ingresan
    	
        
   	listaDeResultados = new CsvToBeanBuilder(new FileReader(rutaDelArchivoResultados))
   
   		// realiza un skip del CSV
            
   			.withSkipLines(1)
            
   			/*seleccionamos el separador
   			 * en este caso es ","
   			 */
   			
   			.withSeparator(',')
            
   			
   			/* desde el CSV
   			 * define los datos a ser generados
   			 */
   			
 			
        
   			.withType(Resultado.class)
            
   			.build()
            
   			.parse();

        } catch (IOException e) {
      
        	e.printStackTrace();
    }
        
    return listaDeResultados;
    
    }
    
    public List<Pronostico> parsearPronosticos(String rutaDelArchivoPronosticos) {
    
    	List<Pronostico> listaDePronosticos = null;
        
    	try {
        
    		// Define el dato a ingresar en el CSV
        	
    		listaDePronosticos = new CsvToBeanBuilder(new FileReader(rutaDelArchivoPronosticos))
            
    				// Realiza un skip de la primer linea del CSV
                    
    				.withSkipLines(1)
                    
    	   			/*seleccionamos el separador
    	   			 * en este caso es ","
    	   			 */
    				
    				                
    				.withSeparator(',')
                    
    				/*Determina el objeto al metodo parse
    				 * hacia el CSV
    				 */
    				
    				                    
    				.withType(Pronostico.class)
                    
    				.build()
                    
    				.parse();

        } catch (IOException e) {
       
        	e.printStackTrace();
    }
        return listaDePronosticos;
    }

}
