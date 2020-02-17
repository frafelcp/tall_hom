/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Felix Castro
 */
public class dos {
    public static void main(String[] args) {               
        //definimos variables y vectores
        String [] nombres;
        int numNombre;
        String res;
                
        //ingresar cuantos nombres se van a registrar
        numNombre = Integer.parseInt(JOptionPane.showInputDialog("MOSTRAR NOMBRES "
                + "REPETIDOS\nDigite cuantos nombres requiere registrar:"));
        
        //inicializamos el vector nombre
        nombres = new String[numNombre];
        
        //llenamos el vector
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Registro de usuarios\n" + 
                    (i+1)+".Digite un nombre");
        }
        
        //inicializamos la variable
        res = "";
        
        //imprimir los repetidos
        for (int k = 0; k < nombres.length - 1; k++) {
            int l = k + 1;
            while (l < nombres.length && !nombres[k].equals(nombres[l])) {                
                l++;
            }
            if (l < nombres.length) {
                res += nombres[k] + " duplicado en: " + k + " y " + l + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, res);
    }
}
