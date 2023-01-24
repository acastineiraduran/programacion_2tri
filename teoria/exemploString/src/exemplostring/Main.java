/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplostring;

/**
 *
 * @author dam1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos metodosObx = new Metodos();
        // Numero de letras
        int numLetras = metodosObx.numeroLetras("Angel");
        System.out.println("numLetras = " + numLetras);
        
        // Capital letters
        String mayusculas = metodosObx.capitalLetters("Angel");
        System.out.println("mayusculas = " + mayusculas);
        
        // Pasar a minusculas
        String minusculas = metodosObx.lowerLetters("AngEL");
        System.out.println("minusculas = " + minusculas);
        
        // Comparar nombre inicial con ...
        metodosObx.comparar("angel", "angel");
        
        // Comparar nombre inicial con ... no ignorando mayus y minus
        metodosObx.compararExacto("angel", "angel");
        
        // Pasar de array
        char []arrayChar = metodosObx.passToArray("angeles");
        for (int i = 0; i < arrayChar.length; i++){
            System.out.println("integrante " + i + "=" + arrayChar[i]);
        }
        
        // Metodo cortar
        String cortar = metodosObx.cortar("angeles");
        System.out.println("cortar = " + cortar);
    }
    
}
