
package exemploarrays;

import nosaLibreria.PedirDatos;

public class Metodos {
    public float[] crearArrayFloat(){
        float []temperaturas = new float [5];
        for(int i = 0; i < temperaturas.length; i++){
            /* previamente tenemos que importar nuestra libreria en el repo Libraries
             clean and build (nosaLibreria proyecto); click derecho Libraries
             (nuestro proyecto); add JAR; dist; y añadimos el .jar */
            temperaturas [i] = PedirDatos.pedirFloat("temperaturas: ");
        }
        return temperaturas;
                
    }
    
    public void amosarArray (float []temperaturas) {
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura posicion " +  i + ": "+ temperaturas[i]);
        }
    }
    
    // Temperatura del martes? (posicion 1 programador <-> posicion 2 usuario
    public void amosarPorPosicion (float []temperaturas, int posicion) {
        System.out.println("La posicion " + posicion + " corresponde con la Ta: " + temperaturas[posicion -1]);
    }
    
}
