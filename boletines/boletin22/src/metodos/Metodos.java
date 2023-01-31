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
    // corregir: importar el jar de pedirdatos en vez de la clase

    private int golesMarcados[][] = new int[2][3];
    private String xornada[] = {"x1", "x2", "x3"};
    private String equipo[] = {"celta", "depor"};

    private int golesEquipo[] = new int [2];

    public int[][] creaArray() {
        for (int i = 0; i < golesMarcados.length; i++) {
            for (int j = 0; j < golesMarcados[i].length; j++) {
                golesMarcados[i][j] = PedirDatos.getNumeroRandom(0, 5);
            }
        }
        return golesMarcados;
    }

    public void mostrarArray() {
        System.out.print("    ");
        for (int j = 0; j < golesMarcados[0].length; j++) {
            System.out.print(" " + xornada[j]);
        }
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i]);

            for (int j = 0; j < golesMarcados[i].length; j++) {
                System.out.print(" ");
                System.out.print(golesMarcados[i][j]); // NO utiliza println()
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    public void equiposGoles() {
        System.out.print("    ");
        System.out.println();

        for (int i = 0; i < golesMarcados.length; i++) {
            System.out.print(equipo[i]);
            
            for (int j = 0; j < golesMarcados[i].length; j++) {
                System.out.print(golesMarcados[i][j]);
                golesEquipo[i] = golesEquipo[i] + golesMarcados[i][j];
                
            }
            
            
            System.out.println("golesEquipo[i] = " + golesEquipo[i]);
            System.out.println();
            
        }
        
    }
    
    public void verGolesEquipos(){
        
        for(int i = 0; i < golesMarcados.length; i++){
            System.out.println("golesEquipo[i] = " + golesEquipo[i]);
        }
    }

}
