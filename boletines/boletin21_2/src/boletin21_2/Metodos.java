/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin21_2;
import nosaLibreria.PedirDatos;
/**
 *
 * @author dam1
 */
public class Metodos {
    private float arrayNotas[] = new float [6];
    private String arrayNomes[] = {"angel","juan","paco","jorge","alberto","fede"};
    private int numeroAprobados;
    private int numeroSuspensos;
    private float media;
    private float sumaNotas;
    
    public void crearArray(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            this.arrayNotas[i] = PedirDatos.pedirFloat("Introducir nota del alumno: " + arrayNomes[i]);
            System.out.println("La nota del alumno " + arrayNomes[i] + " es " +  arrayNotas[i]);
        }
    }
    public void aprobadosSuspensos(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            if (this.arrayNotas[i] >= 5){
                this.numeroAprobados = this.numeroAprobados + 1;
            }
            else {
                this.numeroSuspensos = this.numeroSuspensos + 1;
            }
        }
        System.out.println("numeroAprobados = " + numeroAprobados);
        System.out.println("numeroSuspensos = " + numeroSuspensos);
    }
    
    public void notaMedia(){
        for (int i = 0; i < this.arrayNotas.length; i++){
            this.sumaNotas = this.sumaNotas + this.arrayNotas[i]; 
        }
        this.media = this.sumaNotas / this.arrayNotas.length;
        System.out.println("Nota media = " + this.media);
    }
}
