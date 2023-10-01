/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.flujo.de.agua;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class CalculadoraDeFlujoDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double velocidad;
        double area;
        double flujo;
        Scanner captu = new Scanner(System.in);
        System.out.println("ingrese el radio de la tuberia en metros");
        radio= captu.nextDouble();
        System.out.println("ingrese la velocidad del flujo de agua");
        velocidad= captu.nextDouble();
        area=3.1416*(radio*radio);
        flujo=area*velocidad;
        System.out.println("la cantidd de metros cubicos que fluyenpor la tuberia es:");
        System.out.println(flujo);
    }
    
}
