
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
            System.out.println("Temperatura posicion " +  i + ": " + temperaturas[i]);
        }
    }
    public void amosarArraySegundoMetodo (float []temperaturas) {
        // for each: mas facil y especial para recorrer colleciones (solo deben de ser de objetos)
        /* coge un dato basico (temperaturas) y lo pasa a un dato referenciado (elemento).
        Los dos puntos funcionamiento: cogen el array temperatura, lo va recorriendo dato a dato y cada uno de los
        datos los va pasando a la array elemento.
        */
        for(Float elemento:temperaturas) // siempre lo tiene que meter en una clase (en este caso: Float) 
            System.out.println("****" + elemento);
    }
    
    // Temperatura del martes? (posicion 1 programador <-> posicion 2 usuario
    public void amosarPorPosicion (float []temperaturas, int posicion) {
        System.out.println("La posicion " + posicion + " corresponde con la Ta: " + temperaturas[posicion -1]);
    }
    
}
