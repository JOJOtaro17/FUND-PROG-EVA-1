/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion.de.temperaturas;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ConversionDeTemperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheit;
        double celsius;
        double kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la temperatura fahrenheit a convertir: ");
        fahrenheit= captu.nextDouble();
        celsius=(fahrenheit - 32)* 5/9;
        System.out.println("la conversion a celsius es:");
        System.out.println(celsius);
        kelvin=(fahrenheit - 32)* 5/9 + 273.15;
        System.out.println("la conversion a kelvin es:");
        System.out.println(kelvin);
    }
    
}
