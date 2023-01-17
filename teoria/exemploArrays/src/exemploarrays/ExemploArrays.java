
package exemploarrays;

public class ExemploArrays {

    public static void main(String[] args) {
        Metodos obx = new Metodos ();
        float []aux;
        aux = obx.crearArrayFloat();
        obx.amosarArray(aux);
        obx.amosarPorPosicion(aux, 1);
    }
    
}
