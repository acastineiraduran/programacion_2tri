
package nosaLibreria;

import javax.swing.JOptionPane;

public class PedirDatos {
    public static float pedirFloat (String Mensaje){ // static para poder utilizar directamente nome clase
        return Float.parseFloat(JOptionPane.showInputDialog(Mensaje));
    }
    
}
