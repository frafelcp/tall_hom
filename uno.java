/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ho;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class uno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int pos = 0;
        int neg = 0;
        int cer = 0;
        
        int n = 4;
        
        int [] lista = new int[n];
        int [] listaPos = new int[n];
        int [] listaNeg = new int[n];
        int [] listaCer = new int[n];
        
        for (int i = 1; i < n; i++) {
            lista[i] = leer.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            if (lista[i] > 0) {
                pos++;
                listaPos[pos] = lista[i];
            } else {
                if (lista[i] < 0) {
                    neg++;
                    listaNeg[neg] = lista[i];
                } else {
                    cer++;
                    listaCer[cer] = lista[i];
                }
            }
        }
        
        for (int i = 1; i <= pos; i++) {
            System.out.println(listaPos[i]);
        }
        
        for (int i = 1; i <= neg; i++) {
            System.out.println(listaNeg[i]);
        }
        
        for (int i = 1; i <= cer; i++) {
            System.out.println(listaCer[i]);
        }
    }
}
