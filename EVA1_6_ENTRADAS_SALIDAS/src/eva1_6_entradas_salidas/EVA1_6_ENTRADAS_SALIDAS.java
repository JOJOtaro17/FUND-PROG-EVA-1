/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author Joshua
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
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anion);
    }
    
}
