/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class tres {

    public static void main(String[] args) {
        //CONTROL PRIMARIO
        int c;

        do {
            //INGRESAR MESES
            //variables e inicializacion
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

            //INGRESAR REGIONES
            //varaibles e inicializacion
            String[] regiones = {"norte", "centro", "sur"};

            //PROMEDIOS DE LLUVIAS REGION NORTE
            //variables e inicializacion
            double[] rN = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de promedios de lluvias de la region"
                    + " " + regiones[0]);
            for (int i = 0; i < meses.length; i++) {
                rN[i] = Double.parseDouble(JOptionPane.showInputDialog("Promedio "
                        + "del mes " + meses[i]));
            }

            //PROMEDIOS DE LLUVIAS REGION CENTRO
            //variables e inicializacion
            double[] rC = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de promedios de lluvias de la region"
                    + " " + regiones[1]);
            for (int i = 0; i < meses.length; i++) {
                rC[i] = Double.parseDouble(JOptionPane.showInputDialog("Promedio "
                        + "del mes " + meses[i]));
            }

            //PROMEDIOS DE LLUVIAS REGION SUR
            //variables e inicializacion
            double[] rS = new double[meses.length];

            //leer produccion
            JOptionPane.showMessageDialog(null, "Registro de promedios de lluvias de la region"
                    + " " + regiones[2]);
            for (int i = 0; i < meses.length; i++) {
                rS[i] = Double.parseDouble(JOptionPane.showInputDialog("Promedio "
                        + "del mes " + meses[i]));
            }

            //PROMEDIO ANUAL REGION CENTRO
            //variables
            double sumPromRegCen = 0;
            double promPromRegCen;

            //suma de promedios
            for (int i = 0; i < rC.length; i++) {
                sumPromRegCen += rC[i];
            }

            //promedio
            promPromRegCen = sumPromRegCen / rC.length;

            //PROMEDIOS ANUALES LAS REGIONES
            double[] promReg = {promPromRegCen};

            //A.PROMEDIO ANUAL REGION CENTRO
            JOptionPane.showMessageDialog(null, " Promedio anual lluvias en region " + regiones[1] + promReg[0]);

            //B.MES Y REGISTRO CON MENOR LLUVIA EN LA REGION CENTRO
            //variables
            double mMn = rC[0];

            //comparaion
            for (int i = 0; i < rC.length; i++) {
                if (rC[i] < mMn) {
                    mMn = rC[i];
                }
            }

            //escribir
            for (int i = 0; i < rC.length; i++) {
                if (rC[i] == mMn) {
                    JOptionPane.showMessageDialog(null, "Menor "
                            + "lluvia en el mes \n"
                            + meses[i] + ":" + mMn);
                }
            }

            //SUMA PROMEDIOS REGION NORTE
            //variables
            double sumPromRn = 0;

            //suma
            for (int i = 0; i < rN.length; i++) {
                sumPromRn += rN[i];
            }

            //SUMA PROMEDIOS REGION CENTRO
            //variables
            double sumPromRc = 0;

            //suma
            for (int i = 0; i < rC.length; i++) {
                sumPromRc += rC[i];
            }

            //SUMA PROMEDIOS REGION NORTE
            //variables
            double sumPromRs = 0;

            //suma
            for (int i = 0; i < rS.length; i++) {
                sumPromRs += rS[i];
            }

            //C.REGION CON MAYOR LLUVIA ANUAL
            double[] mayAn = {sumPromRn, sumPromRc, sumPromRs};
            double anMy = mayAn[0];
            int ma = 0;

            for (int i = 0; i < mayAn.length; i++) {
                if (mayAn[i] > ma) {
                    anMy = mayAn[i];
                    ma++;
                }
            }

            //escribimos
            if (anMy == sumPromRn) {
                JOptionPane.showMessageDialog(null, "Mayor lluvia\n" + regiones[0] + anMy);
            } else {
                if (anMy == sumPromRc) {
                    JOptionPane.showMessageDialog(null, "Mayor lluvia\n" + regiones[1] + anMy);
                } else {
                    if (anMy == sumPromRs) {
                        JOptionPane.showMessageDialog(null, "Mayor lluvia\n" + regiones[2] + anMy);
                    }
                }
            }

            //CONTROL PRIMARIO
            c = Integer.parseInt(JOptionPane.showInputDialog("Continuar en el programa"
                    + "\n1.Si\n2.No\nSeleccione una opcion:"));
        } while (c == 1);
    }
}
