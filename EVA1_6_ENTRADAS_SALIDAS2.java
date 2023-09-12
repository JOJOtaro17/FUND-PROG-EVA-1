/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADAS_SALIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int anion;
        Scanner input = new Scanner(System.in);
        //Hay un paquete System, dentro de un paquete out, y dentro
        //de out,la instruccion println
        System.out.println("Ingresa la marca del auto");
        marca = input.nextLine();
        System.out.println("Ingresa el modelo del auto");
        modelo = input.nextLine();
        System.out.println("Ingresa el año del auto");
        anion = input.nextInt();
        System.out.println("marca");
        System.out.println("modelo");
        System.out.println("anion");
    }

}
