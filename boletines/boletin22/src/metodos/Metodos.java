/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Arrays;
import nosaLibreria.PedirDatos;

/**
 *
 * @author casty
 */
public class Metodos {

    int golesMarcados[][] = new int[2][3];
    String xornada[ ] = {"X1", "X2", "X3"};
    String equipo[ ] = {"celta", "depor"}; 

    public int[][] creaArray() {
        for (int i = 0; i < golesMarcados.length; i++) {
            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesMarcados[i][j] = PedirDatos.getNumeroRandom(0, 5);
            }
        }
        return golesMarcados;
    }

    public void mostrarArray() {
       
        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[ i ]);
            
            for (int j = 0; j < golesMarcados[i].length; j++) {
                System.out.print(" [ ");
                System.out.print(golesMarcados[i][j]); // NO utiliza println()
                System.out.print(" ] ");
            }
            System.out.println();

        }
        
    }
    
    public void equiposGoles(){
        
    }

}
