package org.Example.ExampleLecturaCSV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.Example.ExampleLecturaCSV.models.Pronostico;
import org.Example.ExampleLecturaCSV.models.Resultado;

public class App 
{
    public static void main( String[] args )
    {
    	
    	LectorArchivos lectorArchivos = new LectorArchivos();
    	
    	
    	/*leo el archivo
    	 * asigno valor a la variable
    	 */
    	
    	   	
        List<Resultado> listaResultado = 
     
        lectorArchivos.parsearResultados("src/main/resources/Resultados.csv");

    	
        /*Lee el archivo del pronostico
         * lo asigno a una variable
         */
        
        List<Pronostico> listaPronosticos = 
        
        lectorArchivos.parsearPronosticos("src/main/resources/Pronosticos.csv");

        /* hash set
         * y adiciona ppuntos a los equipos
         */
        
                       
        Map<String,Integer> puntosParticipantes = new HashMap<String, Integer>();
        
        
        //Este FOR va a consultar a los pronosticos
        
        for(Pronostico pronostico : listaPronosticos) {
        	
        
        //Consulta si existe el Participante(s)
        
        if(!puntosParticipantes.containsKey(pronostico.getParticipante())){
        
        //De no encontrar un match lo agrega con puntos 0
        	
        puntosParticipantes.put(pronostico.getParticipante(),0);
        	}
        
  
        //El for es para buscar los partidos en los resultados
 
        for(Resultado resultado : listaResultado) {
        
        	
        	
       	if(resultado.getEquipo1().equalsIgnoreCase(pronostico.getEquipo1())

       	&& resultado.getEquipo2().equalsIgnoreCase(pronostico.getEquipo2())) {
       
       		
     /*Cuando busca el partido y lo encuentra
      * se controla el resultado
      * entre gano Empato O Perdio
      */
       		
       
        	
     if(resultado.ganoEmpatoOPerdioElEquipo1() == pronostico.ganoEmpatoOPerdioElEquipo1()) {
     
     //Suma puntos si el pronostico es =
    
   	 puntosParticipantes.put(pronostico.getParticipante(),
   
   	 //Busca al Participante y le ++1
    
   	 puntosParticipantes.get(pronostico.getParticipante())+1);   	
   	 
        			}
        		}
        	}
        }
        
      
        //SOUT en consola el puntaje
        
        for(String participante : puntosParticipantes.keySet()) {
        
        	System.out.println(participante+": "+puntosParticipantes.get(participante));
        }
    }
}
